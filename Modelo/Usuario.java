package Modelo;

public class Usuario {

    private int IdentificacionUsuario;
    private String NombreUsuario;
    private String ApellidoUsuario;
    private String CorreoUsuario;
    private String ContrasenaUsuario;
    private String TelefonoUsuario;
    private String DireccionUsuario;
    private String EstadoUsuario;
    private String TipoUsuario;
    private String FechaRegistroUsuario;
    private String FechaActualizacionUsuario;

    public Usuario(int identificacionUsuario, String nombreUsuario, String apellidoUsuario, String correoUsuario,
            String contrasenaUsuario, String telefonoUsuario, String direccionUsuario, String estadoUsuario,
            String tipoUsuario, String fechaRegistroUsuario, String fechaActualizacionUsaurio) {
        IdentificacionUsuario = identificacionUsuario;
        NombreUsuario = nombreUsuario;
        ApellidoUsuario = apellidoUsuario;
        CorreoUsuario = correoUsuario;
        ContrasenaUsuario = contrasenaUsuario;
        TelefonoUsuario = telefonoUsuario;
        DireccionUsuario = direccionUsuario;
        EstadoUsuario = estadoUsuario;
        TipoUsuario = tipoUsuario;
        FechaRegistroUsuario = fechaRegistroUsuario;
        FechaActualizacionUsuario = fechaActualizacionUsaurio;
    }

    public int getIdentificacionUsuario() {
        return IdentificacionUsuario;
    }

    public void setIdentificacionUsuario(int identificacionUsuario) {
        IdentificacionUsuario = identificacionUsuario;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        NombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return ApellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        ApellidoUsuario = apellidoUsuario;
    }

    public String getCorreoUsuario() {
        return CorreoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        CorreoUsuario = correoUsuario;
    }

    public String getContrasenaUsuario() {
        return ContrasenaUsuario;
    }

    public void setContrasenaUsuario(String contrasenaUsuario) {
        ContrasenaUsuario = contrasenaUsuario;
    }

    public String getTelefonoUsuario() {
        return TelefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        TelefonoUsuario = telefonoUsuario;
    }

    public String getDireccionUsuario() {
        return DireccionUsuario;
    }

    public void setDireccionUsuario(String direccionUsuario) {
        DireccionUsuario = direccionUsuario;
    }

    public String getEstadoUsuario() {
        return EstadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        EstadoUsuario = estadoUsuario;
    }

    public String getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        TipoUsuario = tipoUsuario;
    }

    public String getFechaRegistroUsuario() {
        return FechaRegistroUsuario;
    }

    public void setFechaRegistroUsuario(String fechaRegistroUsuario) {
        FechaRegistroUsuario = fechaRegistroUsuario;
    }

    public String getFechaActualizacionUsuario() {
        return FechaActualizacionUsuario;
    }

    public void setFechaActualizacionUsuario(String fechaActualizacionUsaurio) {
        FechaActualizacionUsuario = fechaActualizacionUsaurio;
    }
}