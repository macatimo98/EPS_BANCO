
public class Mantenimiento extends Trabajador {
    private String area;
    private String dependencia;

    public Mantenimiento(String idTrabajador, String area, String dependencia, String jornada) {
        super(idTrabajador, jornada);
        this.area = area;
        this.dependencia = dependencia;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public void solicitarVacaciones() {
        // Implementación del método solicitarVacaciones
        System.out.println("Se ha solicitado vacaciones para personal de mantenimiento");
    }
}
