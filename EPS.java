import java.util.ArrayList;

public class EPS {
    private String nombre;
    private String registroCamara;
    private ArrayList<Trabajador> empleados;
    private ArrayList<Afiliado> afiliados;

    public EPS(String nombre, String registroCamara) {
        this.nombre = nombre;
        this.registroCamara = registroCamara;
        this.empleados = new ArrayList<>();
        this.afiliados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegistroCamara() {
        return registroCamara;
    }

    public void setRegistroCamara(String registroCamara) {
        this.registroCamara = registroCamara;
    }

    public ArrayList<Trabajador> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Trabajador> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Afiliado> getAfiliados() {
        return afiliados;
    }

    public void setAfiliados(ArrayList<Afiliado> afiliados) {
        this.afiliados = afiliados;
    }
}

