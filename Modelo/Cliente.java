package Modelo;

public class Cliente extends Usuario{
    
    private int identificacionCliente;
    private int IdentificacionUsuario;
    private int IdentificacionMembresia;
    private String EstadoCliente;
    private String FechaRegistroCliente;
    private String FechaActualizacionCliente;

    public Cliente(int identificacionUsuario, String nombreUsuario, String apellidoUsuario, String correoUsuario,
            String contrasenaUsuario, String telefonoUsuario, String direccionUsuario, String estadoUsuario,
            String tipoUsuario, String fechaRegistroUsuario, String fechaActualizacionUsuario, int identificacionCliente,
            int identificacionUsuario2, int identificacionMembresia, String estadoCliente, String fechaRegistroCliente,
            String fechaActualizacionCliente) {
        super(identificacionUsuario, nombreUsuario, apellidoUsuario, correoUsuario, contrasenaUsuario, telefonoUsuario,
                direccionUsuario, estadoUsuario, tipoUsuario, fechaRegistroUsuario, fechaActualizacionUsuario);
        this.identificacionCliente = identificacionCliente;
        IdentificacionUsuario = identificacionUsuario2;
        IdentificacionMembresia = identificacionMembresia;
        EstadoCliente = estadoCliente;
        FechaRegistroCliente = fechaRegistroCliente;
        FechaActualizacionCliente = fechaActualizacionCliente;
    }

    public int getIdentificacionCliente() {
        return identificacionCliente;
    }

    public void setIdentificacionCliente(int identificacionCliente) {
        this.identificacionCliente = identificacionCliente;
    }

    public int getIdentificacionUsuario() {
        return IdentificacionUsuario;
    }

    public void setIdentificacionUsuario(int identificacionUsuario) {
        IdentificacionUsuario = identificacionUsuario;
    }

    public int getIdentificacionMembresia() {
        return IdentificacionMembresia;
    }

    public void setIdentificacionMembresia(int identificacionMembresia) {
        IdentificacionMembresia = identificacionMembresia;
    }

    public String getEstadoCliente() {
        return EstadoCliente;
    }

    public void setEstadoCliente(String estadoCliente) {
        EstadoCliente = estadoCliente;
    }

    public String getFechaRegistroCliente() {
        return FechaRegistroCliente;
    }

    public void setFechaRegistroCliente(String fechaRegistroCliente) {
        FechaRegistroCliente = fechaRegistroCliente;
    }

    public String getFechaActualizacionCliente() {
        return FechaActualizacionCliente;
    }

    public void setFechaActualizacionCliente(String fechaActualizacionCliente) {
        FechaActualizacionCliente = fechaActualizacionCliente;
    }
}
