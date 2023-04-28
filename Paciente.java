public class Paciente extends Persona {
    private String historiaClinica;
    private EPS eps;
    private Medico medico;

    public Paciente(String nombre, String apellido, String id, String historiaClinica, EPS eps, Medico medico) {
        super(nombre, apellido, id);
        this.historiaClinica = historiaClinica;
        this.eps = eps;
        this.medico = medico;
    }

    // Métodos getters y setters
    public String getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(String historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public EPS getEps() {
        return eps;
    }

    public void setEps(EPS eps) {
        this.eps = eps;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
