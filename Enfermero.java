public class Enfermero extends Persona implements Sector_Salud {
    private int piso;

    public Enfermero(String nombre, int id, String apellido, int piso) {
        super(nombre, id, apellido);
        this.piso = piso;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }
}
