package Modelo;

import java.io.File;

public class Nutricionista extends Usuario{
    
    private int identificacionNutricionista;
    private int IdentificacionUsuario;
    private String EspecialidadNutricionista;
    private File CertificacionNutricionista;
    private String ExperienciaNutricionista;
    private String EstadoNutricionista;
    private String FechaRegistroNutricionista;
    private String FechaActualizacionNutricionista;

    public Nutricionista(int identificacionUsuario, String nombreUsuario, String apellidoUsuario, String correoUsuario,
            String contrasenaUsuario, String telefonoUsuario, String direccionUsuario, String estadoUsuario,
            String tipoUsuario, String fechaRegistroUsuario, String fechaActualizacionUsaurio, int identificacionNutricionista,
            int identificacionUsuario2, String especialidadNutricionista, File certificacionNutricionista,
            String experienciaNutricionista, String estadoNutricionista, String fechaRegistroNutricionista,
            String fechaActualizacionNutricionista) {
        super(identificacionUsuario, nombreUsuario, apellidoUsuario, correoUsuario, contrasenaUsuario, telefonoUsuario,
                direccionUsuario, estadoUsuario, tipoUsuario, fechaRegistroUsuario, fechaActualizacionUsaurio);
        this.identificacionNutricionista = identificacionNutricionista;
        IdentificacionUsuario = identificacionUsuario2;
        EspecialidadNutricionista = especialidadNutricionista;
        CertificacionNutricionista = certificacionNutricionista;
        ExperienciaNutricionista = experienciaNutricionista;
        EstadoNutricionista = estadoNutricionista;
        FechaRegistroNutricionista = fechaRegistroNutricionista;
        FechaActualizacionNutricionista = fechaActualizacionNutricionista;
    }

    public int getIdentificacionNutricionista() {
        return identificacionNutricionista;
    }

    public void setIdentificacionNutricionista(int identificacionNutricionista) {
        this.identificacionNutricionista = identificacionNutricionista;
    }

    public int getIdentificacionUsuario() {
        return IdentificacionUsuario;
    }

    public void setIdentificacionUsuario(int identificacionUsuario) {
        IdentificacionUsuario = identificacionUsuario;
    }

    public String getEspecialidadNutricionista() {
        return EspecialidadNutricionista;
    }

    public void setEspecialidadNutricionista(String especialidadNutricionista) {
        EspecialidadNutricionista = especialidadNutricionista;
    }

    public File getCertificacionNutricionista() {
        return CertificacionNutricionista;
    }

    public void setCertificacionNutricionista(File certificacionNutricionista) {
        CertificacionNutricionista = certificacionNutricionista;
    }

    public String getExperienciaNutricionista() {
        return ExperienciaNutricionista;
    }

    public void setExperienciaNutricionista(String experienciaNutricionista) {
        ExperienciaNutricionista = experienciaNutricionista;
    }

    public String getEstadoNutricionista() {
        return EstadoNutricionista;
    }

    public void setEstadoNutricionista(String estadoNutricionista) {
        EstadoNutricionista = estadoNutricionista;
    }

    public String getFechaRegistroNutricionista() {
        return FechaRegistroNutricionista;
    }

    public void setFechaRegistroNutricionista(String fechaRegistroNutricionista) {
        FechaRegistroNutricionista = fechaRegistroNutricionista;
    }

    public String getFechaActualizacionNutricionista() {
        return FechaActualizacionNutricionista;
    }

    public void setFechaActualizacionNutricionista(String fechaActualizacionNutricionista) {
        FechaActualizacionNutricionista = fechaActualizacionNutricionista;
    }
}
