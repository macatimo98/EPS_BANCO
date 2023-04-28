public class Trabajador {
    private String idTrabajador;
    private String area;
    private String jornada;

    public Trabajador(String idTrabajador, String area, String jornada) {
        this.idTrabajador = idTrabajador;
        this.area = area;
        this.jornada = jornada;
    }

    public String getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(String idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public void solicitarVacaciones() {
        // Aquí iría el código para solicitar vacaciones
        System.out.println("Se ha solicitado vacaciones");
    }
}
