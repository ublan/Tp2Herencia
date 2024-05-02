public class Vivienda extends Inmueble {
    private int numeroHabitaciones;
    private int numeroBanios;

    public Vivienda(int id, int metrosCuadrados, String direccion, int numeroHabitaciones, int numeroBanios) {
        super(id, metrosCuadrados, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBanios = numeroBanios;
    }   

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public int getNumeroBanios() {
        return numeroBanios;
    }

    public void setNumeroBanios(int numeroBanios) {
        this.numeroBanios = numeroBanios;
    }

    @Override
    public String toString() {
        return "Vivienda:\n" +
                "Numero Habitaciones: " + numeroHabitaciones + "\n" +
                "Numero Banios: " + numeroBanios;
    }
}
