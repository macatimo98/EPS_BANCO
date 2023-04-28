import java.util.List;

public class Administrativos extends Trabajador {
    private String cargo;
    private String jefe;
    private List<String> permisos;

    public Administrativos(int idTrabajador, String area, String jornada, String cargo, String jefe, List<String> permisos) {
        super(idTrabajador, area, jornada);
        this.cargo = cargo;
        this.jefe = jefe;
        this.permisos = permisos;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public List<String> getPermisos() {
        return permisos;
    }

    public void setPermisos(List<String> permisos) {
        this.permisos = permisos;
    }

    public void pagoNomina() {
        // Lógica para realizar el pago de la nómina
    }
}
