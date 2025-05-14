<?php

require_once 'Conexion.php';

class UsuarioController {
    private $conexion;

    public function __construct() {
        $db = new Conexion();
        $this->conexion = $db->getConexion();
    }

    // Método para registrar un usuario
    public function registrarUsuario($nombres, $apellidos, $correo, $telefono, $direccion, $contrasena) {
        $estadoUsuario = "Inactivo";
        $tipoUsuario = "Sin Rol";
        $fechaCreacion = date("Y-m-d H:i:s");
        $fechaActualizacion = date("Y-m-d H:i:s");

        $sql = "INSERT INTO usuarios (Nombres, Apellidos, CorreoElectronico, Telefono, Direccion, Contrasena, EstadoUsuario, TipoUsuario, created_at, updated_at) 
                VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        $stmt = $this->conexion->prepare($sql);
        $stmt->bind_param("ssssssssss", $nombres, $apellidos, $correo, $telefono, $direccion, $contrasena, $estadoUsuario, $tipoUsuario, $fechaCreacion, $fechaActualizacion);

        return $stmt->execute();
    }

    // Método para iniciar sesión
    public function loginUsuario($correo, $contrasena) {
        // Verificar si el usuario existe y obtener su información
        $sql = "SELECT IdentificacionUsuario, Nombres, Apellidos, CorreoElectronico, TipoUsuario, EstadoUsuario 
                FROM usuarios 
                WHERE CorreoElectronico = ? AND Contrasena = ?";
        
        $stmt = $this->conexion->prepare($sql);
        $stmt->bind_param("ss", $correo, $contrasena);
        $stmt->execute();
        $result = $stmt->get_result();
        
        if ($result->num_rows > 0) {
            return $result->fetch_assoc(); // Devolver la información del usuario
        }
        
        return null; // Usuario no encontrado o credenciales incorrectas
    }

    // Método para recuperar contraseña
    public function recuperarContrasena($correo) {
        $sql = "SELECT CorreoElectronico FROM usuarios WHERE CorreoElectronico = ?";
        $stmt = $this->conexion->prepare($sql);
        $stmt->bind_param("s", $correo);
        $stmt->execute();
        $stmt->store_result();

        if ($stmt->num_rows > 0) {
            // Generar una nueva contraseña temporal o código de verificación
            $codigo = sprintf("%06d", mt_rand(1, 999999));
            
            // Guardar el código en una sesión para verificarlo después
            session_start();
            $_SESSION['codigo_recuperacion'] = [
                'correo' => $correo,
                'codigo' => $codigo,
                'tiempo' => time()
            ];
            
            // Enviar el correo con el código (esto es simulado, para envío real usar mail() o PHPMailer)
            // mail($correo, "Código de recuperación de contraseña", "Tu código de verificación es: $codigo");
            
            // Para propósitos de prueba, puedes imprimir el código en la consola o logs
            error_log("Código de verificación para $correo: $codigo");
            
            return true;
        }
        return false; // Correo no encontrado
    }
}

// Procesar la solicitud POST
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $accion = $_POST['accion'];
    $controller = new UsuarioController();

    if ($accion === 'registrar') {
        $nombres = $_POST['Nombres'];
        $apellidos = $_POST['Apellidos'];
        $correo = $_POST['CorreoElectronico'];
        $telefono = $_POST['Telefono'];
        $direccion = $_POST['Direccion'];
        $contrasena = $_POST['Contrasena'];

        $resultado = $controller->registrarUsuario($nombres, $apellidos, $correo, $telefono, $direccion, $contrasena);

        if ($resultado) {
            // Redirige al usuario a la página de registro con un parámetro de éxito
            // El modal en registrarse.html detectará este parámetro y mostrará el mensaje
            header("Location: ../Vista/registrarse.html?registro=exitoso");
            exit();
        } else {
            header("Location: ../Vista/registrarse.html?error=registro");
            exit();
        }
    } elseif ($accion === 'login') {
        $correo = $_POST['correo'];
        $contrasena = $_POST['contrasena'];

        // Verificar si el usuario existe y obtener su información
        $usuario = $controller->loginUsuario($correo, $contrasena);

        if ($usuario) {
            if ($usuario['EstadoUsuario'] !== 'Activo') {
                // Usuario inactivo
                header("Location: ../Vista/login.html?error=cuenta_inactiva");
                exit();
            }

            if ($usuario['TipoUsuario'] === 'Administrador') {
                // Usuario es administrador activo, redirigir a la interfaz de administrador
                session_start();
                $_SESSION['usuario'] = $usuario;
                $_SESSION['loggedin'] = true;
                header("Location: ../Vista/Administrador.html");
                exit();
            } else {
                // Usuario no es administrador
                header("Location: ../Vista/login.html?error=no_autorizado");
                exit();
            }
        } else {
            // Credenciales incorrectas
            header("Location: ../Vista/login.html?error=credenciales");
            exit();
        }
    } elseif ($accion === 'recuperar') {
        $correo = $_POST['correo'];

        $resultado = $controller->recuperarContrasena($correo);

        header('Content-Type: application/json');
        
        if ($resultado) {
            echo json_encode(['success' => true]);
        } else {
            echo json_encode(['success' => false]);
        }
        exit();
    }
}
?>