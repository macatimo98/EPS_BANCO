public class Sector_Salud {
    private String sector;
    private String titulo;
    private String areaTrabajo;

    public Sector_Salud(String sector, String titulo, String areaTrabajo) {
        this.sector = sector;
        this.titulo = titulo;
        this.areaTrabajo = areaTrabajo;
    }

    // Getters y Setters
    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }
}
