public class Oficina extends Comercial {
    private int numeroDespachos;

    public Oficina(int id, int metrosCuadrados, String direccion, String localizacion, String centroComercial, int numeroDespachos) {
        super(id, metrosCuadrados, direccion, localizacion, centroComercial);
        this.numeroDespachos = numeroDespachos;
    }

    public int getNumeroDespachos() {
        return numeroDespachos;
    }

    public void setNumeroDespachos(int numeroDespachos) {
        this.numeroDespachos = numeroDespachos;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Tipo: Oficina\n" +
               "Número de Despachos: " + numeroDespachos;
    }
}
