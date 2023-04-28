import java.util.ArrayList;

public class IPS {
    private String nombre;
    private String registroSanitario;
    private ArrayList<EPS> convenios;
    private ArrayList<Sector_Salud> empSalud;
    private ArrayList<Trabajadores> empLogistica;

    public IPS(String nombre, String registroSanitario, ArrayList<EPS> convenios, ArrayList<Sector_Salud> empSalud, ArrayList<Trabajadores> empLogistica) {
        this.nombre = nombre;
        this.registroSanitario = registroSanitario;
        this.convenios = convenios;
        this.empSalud = empSalud;
        this.empLogistica = empLogistica;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegistroSanitario() {
        return registroSanitario;
    }

    public void setRegistroSanitario(String registroSanitario) {
        this.registroSanitario = registroSanitario;
    }

    public ArrayList<EPS> getConvenios() {
        return convenios;
    }

    public void setConvenios(ArrayList<EPS> convenios) {
        this.convenios = convenios;
    }

    public ArrayList<Sector_Salud> getEmpSalud() {
        return empSalud;
    }

    public void setEmpSalud(ArrayList<Sector_Salud> empSalud) {
        this.empSalud = empSalud;
    }

    public ArrayList<Trabajadores> getEmpLogistica() {
        return empLogistica;
    }

    public void setEmpLogistica(ArrayList<Trabajadores> empLogistica) {
        this.empLogistica = empLogistica;
    }

    // Método para afiliar un paciente a un convenio de la IPS
    public void afiliarPacienteConvenio(Paciente paciente, EPS eps) {
        if (convenios.contains(eps)) {
            eps.afiliar(paciente);
        } else {
            System.out.println("La IPS no tiene convenio con la EPS " + eps.getNombre());
        }
    }
}
