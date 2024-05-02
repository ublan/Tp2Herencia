public class Comercial extends Inmueble {
    private String localizacion;
    private String centroComercial;

    public Comercial(int id, int metrosCuadrados, String direccion, String localizacion, String centroComercial) {
        super(id, metrosCuadrados, direccion);
        this.localizacion = localizacion;
        this.centroComercial = centroComercial;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getCentroComercial() {
        return centroComercial;
    }

    public void setCentroComercial(String centroComercial) {
        this.centroComercial = centroComercial;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Tipo: Comercial\n" +
               "Localización: " + localizacion + "\n" +
               "Centro Comercial: " + centroComercial;
    }
}
