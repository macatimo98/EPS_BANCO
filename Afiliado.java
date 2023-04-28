public class Afiliado {
    private int idAfiliado;
    private EPS eps;
    
    public Afiliado(int idAfiliado, EPS eps) {
        this.idAfiliado = idAfiliado;
        this.eps = eps;
    }

    public int getIdAfiliado() {
        return idAfiliado;
    }

    public void setIdAfiliado(int idAfiliado) {
        this.idAfiliado = idAfiliado;
    }

    public EPS getEps() {
        return eps;
    }

    public void setEps(EPS eps) {
        this.eps = eps;
    }

    public void percita(Persona paciente) {
        // Implementación del método percita
    }
}
