package Modelo;

public class Administrador extends Usuario {

    private int identificacionAdministrador;
    private int IdentificacionUsuario;
    private String EstadoAdministrador;
    private String FechaRegistroAdministrador;
    private String FechaActualizacionAdministrador;

    public Administrador(int identificacionUsuario, String nombreUsuario, String apellidoUsuario, String correoUsuario,
            String contrasenaUsuario, String telefonoUsuario, String direccionUsuario, String estadoUsuario,
            String tipoUsuario, String fechaRegistroUsuario, String fechaActualizacionUsaurio, int identificacionAdministrador,
            int identificacionUsuario2, String estadoAdministrador, String fechaRegistroAdministrador,
            String fechaActualizacionAdministrador) {
        super(identificacionUsuario, nombreUsuario, apellidoUsuario, correoUsuario, contrasenaUsuario, telefonoUsuario,
                direccionUsuario, estadoUsuario, tipoUsuario, fechaRegistroUsuario, fechaActualizacionUsaurio);
        this.identificacionAdministrador = identificacionAdministrador;
        IdentificacionUsuario = identificacionUsuario2;
        EstadoAdministrador = estadoAdministrador;
        FechaRegistroAdministrador = fechaRegistroAdministrador;
        FechaActualizacionAdministrador = fechaActualizacionAdministrador;
    }

    public int getIdentificacionAdministrador() {
        return identificacionAdministrador;
    }

    public void setIdentificacionAdministrador(int identificacionAdministrador) {
        this.identificacionAdministrador = identificacionAdministrador;
    }

    public int getIdentificacionUsuario() {
        return IdentificacionUsuario;
    }

    public void setIdentificacionUsuario(int identificacionUsuario) {
        IdentificacionUsuario = identificacionUsuario;
    }

    public String getEstadoAdministrador() {
        return EstadoAdministrador;
    }

    public void setEstadoAdministrador(String estadoAdministrador) {
        EstadoAdministrador = estadoAdministrador;
    }

    public String getFechaRegistroAdministrador() {
        return FechaRegistroAdministrador;
    }

    public void setFechaRegistroAdministrador(String fechaRegistroAdministrador) {
        FechaRegistroAdministrador = fechaRegistroAdministrador;
    }

    public String getFechaActualizacionAdministrador() {
        return FechaActualizacionAdministrador;
    }

    public void setFechaActualizacionAdministrador(String fechaActualizacionAdministrador) {
        FechaActualizacionAdministrador = fechaActualizacionAdministrador;
    }
    
}
