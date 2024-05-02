public class LocalComercial extends Comercial {

    public LocalComercial(int id, int metrosCuadrados, String direccion, String localizacion, String centroComercial, boolean interno) {
        super(id, metrosCuadrados, direccion, localizacion, centroComercial);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Tipo: Local Comercial" ;
        }
}
