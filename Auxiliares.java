public class Auxiliares extends Persona implements Sector_Salud {
    private Sector_Salud jefeInmediato;

    public Auxiliares(String nombre, int id, String apellido, Sector_Salud jefeInmediato) {
        super(nombre, id, apellido);
        this.jefeInmediato = jefeInmediato;
    }

    @Override
    public String getSector() {
        return "Sector de Auxiliares";
    }

    @Override
    public String getTitulo() {
        return "Auxiliar de enfermería";
    }

    @Override
    public String getAreaTrabajo() {
        return "Cuidado de pacientes";
    }

    public Sector_Salud getJefeInmediato() {
        return jefeInmediato;
    }

    public void setJefeInmediato(Sector_Salud jefeInmediato) {
        this.jefeInmediato = jefeInmediato;
    }
}
