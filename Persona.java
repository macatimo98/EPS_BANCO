import java.util.ArrayList;

public class Persona implements Adapter_abstract {
    private String nombre;
    private int id;
    private String apellido;
    private ArrayList<Sector_Salud> sectoresSalud;
    private EPS eps;
    private Medico medico;
    private HistoriaClinica historiaClinica;

    public Persona(String nombre, int id, String apellido, ArrayList<Sector_Salud> sectoresSalud, EPS eps, Medico medico, HistoriaClinica historiaClinica) {
        this.nombre = nombre;
        this.id = id;
        this.apellido = apellido;
        this.sectoresSalud = sectoresSalud;
        this.eps = eps;
        this.medico = medico;
        this.historiaClinica = historiaClinica;
    }

    // Getters y setters para los atributos de la clase Persona
    // ...

    @Override
    public void adaptar(Persona persona) {
        // Aquí se implementaría el método adaptar de la interface Adapter_abstract
        // ...
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


}