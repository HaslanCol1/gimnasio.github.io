<?php

class Conexion {
    private $host = "localhost"; // Cambia esto si tu host es diferente
    private $usuario = "root";   // Usuario de la base de datos
    private $password = "";      // Contraseña de la base de datos
    private $baseDatos = "dbgimnasio"; // Nombre de la base de datos
    private $conexion;

    public function __construct() {
        $this->conectar();
    }

    private function conectar() {
        $this->conexion = new mysqli($this->host, $this->usuario, $this->password, $this->baseDatos);

        if ($this->conexion->connect_error) {
            die("Error de conexión: " . $this->conexion->connect_error);
        }
    }

    public function getConexion() {
        return $this->conexion;
    }

    public function cerrarConexion() {
        if ($this->conexion) {
            $this->conexion->close();
        }
    }
}
?>