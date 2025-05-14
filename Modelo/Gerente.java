package Modelo;

public class Gerente extends Usuario{
    
    private int identificacionGerente;
    private int IdentificacionUsuario;
    private String EstadoGerente;
    private String FechaRegistroGerente;
    private String FechaActualizacionGerente;

    public Gerente(int identificacionUsuario, String nombreUsuario, String apellidoUsuario, String correoUsuario,
            String contrasenaUsuario, String telefonoUsuario, String direccionUsuario, String estadoUsuario,
            String tipoUsuario, String fechaRegistroUsuario, String fechaActualizacionUsaurio, int identificacionGerente,
            int identificacionUsuario2, String estadoGerente, String fechaRegistroGerente,
            String fechaActualizacionGerente) {
        super(identificacionUsuario, nombreUsuario, apellidoUsuario, correoUsuario, contrasenaUsuario, telefonoUsuario,
                direccionUsuario, estadoUsuario, tipoUsuario, fechaRegistroUsuario, fechaActualizacionUsaurio);
        this.identificacionGerente = identificacionGerente;
        IdentificacionUsuario = identificacionUsuario2;
        EstadoGerente = estadoGerente;
        FechaRegistroGerente = fechaRegistroGerente;
        FechaActualizacionGerente = fechaActualizacionGerente;
    }

    public int getIdentificacionGerente() {
        return identificacionGerente;
    }

    public void setIdentificacionGerente(int identificacionGerente) {
        this.identificacionGerente = identificacionGerente;
    }

    public int getIdentificacionUsuario() {
        return IdentificacionUsuario;
    }

    public void setIdentificacionUsuario(int identificacionUsuario) {
        IdentificacionUsuario = identificacionUsuario;
    }

    public String getEstadoGerente() {
        return EstadoGerente;
    }

    public void setEstadoGerente(String estadoGerente) {
        EstadoGerente = estadoGerente;
    }

    public String getFechaRegistroGerente() {
        return FechaRegistroGerente;
    }

    public void setFechaRegistroGerente(String fechaRegistroGerente) {
        FechaRegistroGerente = fechaRegistroGerente;
    }

    public String getFechaActualizacionGerente() {
        return FechaActualizacionGerente;
    }

    public void setFechaActualizacionGerente(String fechaActualizacionGerente) {
        FechaActualizacionGerente = fechaActualizacionGerente;
    }
}
