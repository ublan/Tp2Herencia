public class Inmueble {

    private int id;
    private int metrosCuadrados;
    private String direccion;

    public Inmueble(int id, int metrosCuadrados, String direccion) {
        this.id = id;
        this.metrosCuadrados = metrosCuadrados;
        this.direccion = direccion;
    }   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Inmueble:\n" +
               "Id: " + id + "\n" +
               "Metros Cuadrados: " + metrosCuadrados + "\n" +
               "Direccion: " + direccion ;
    }
    
}
