package Modelo;

import java.io.File;

public class Entrenador extends Usuario {

    private int identificacionEntrenador;
    private int IdentificacionUsuario;
    private String EspecialidadEntrenador;
    private File CertificacionEntrenador;
    private String ExperienciaEntrenador;
    private String EstadoEntrenador;
    private String FechaRegistroEntrenador;
    private String FechaActualizacionEntrenador;

    public Entrenador(int identificacionUsuario, String nombreUsuario, String apellidoUsuario, String correoUsuario,
            String contrasenaUsuario, String telefonoUsuario, String direccionUsuario, String estadoUsuario,
            String tipoUsuario, String fechaRegistroUsuario, String fechaActualizacionUsaurio, int identificacionEntrenador,
            int identificacionUsuario2, String especialidadEntrenador, File certificacionEntrenador,
            String experienciaEntrenador, String estadoEntrenador, String fechaRegistroEntrenador,
            String fechaActualizacionEntrenador) {
        super(identificacionUsuario, nombreUsuario, apellidoUsuario, correoUsuario, contrasenaUsuario, telefonoUsuario,
                direccionUsuario, estadoUsuario, tipoUsuario, fechaRegistroUsuario, fechaActualizacionUsaurio);
        this.identificacionEntrenador = identificacionEntrenador;
        IdentificacionUsuario = identificacionUsuario2;
        EspecialidadEntrenador = especialidadEntrenador;
        CertificacionEntrenador = certificacionEntrenador;
        ExperienciaEntrenador = experienciaEntrenador;
        EstadoEntrenador = estadoEntrenador;
        FechaRegistroEntrenador = fechaRegistroEntrenador;
        FechaActualizacionEntrenador = fechaActualizacionEntrenador;
    }

    public int getIdentificacionEntrenador() {
        return identificacionEntrenador;
    }

    public void setIdentificacionEntrenador(int identificacionEntrenador) {
        this.identificacionEntrenador = identificacionEntrenador;
    }

    public int getIdentificacionUsuario() {
        return IdentificacionUsuario;
    }

    public void setIdentificacionUsuario(int identificacionUsuario) {
        IdentificacionUsuario = identificacionUsuario;
    }

    public String getEspecialidadEntrenador() {
        return EspecialidadEntrenador;
    }

    public void setEspecialidadEntrenador(String especialidadEntrenador) {
        EspecialidadEntrenador = especialidadEntrenador;
    }

    public File getCertificacionEntrenador() {
        return CertificacionEntrenador;
    }

    public void setCertificacionEntrenador(File certificacionEntrenador) {
        CertificacionEntrenador = certificacionEntrenador;
    }

    public String getExperienciaEntrenador() {
        return ExperienciaEntrenador;
    }

    public void setExperienciaEntrenador(String experienciaEntrenador) {
        ExperienciaEntrenador = experienciaEntrenador;
    }

    public String getEstadoEntrenador() {
        return EstadoEntrenador;
    }

    public void setEstadoEntrenador(String estadoEntrenador) {
        EstadoEntrenador = estadoEntrenador;
    }

    public String getFechaRegistroEntrenador() {
        return FechaRegistroEntrenador;
    }

    public void setFechaRegistroEntrenador(String fechaRegistroEntrenador) {
        FechaRegistroEntrenador = fechaRegistroEntrenador;
    }

    public String getFechaActualizacionEntrenador() {
        return FechaActualizacionEntrenador;
    }

    public void setFechaActualizacionEntrenador(String fechaActualizacionEntrenador) {
        FechaActualizacionEntrenador = fechaActualizacionEntrenador;
    }
}
