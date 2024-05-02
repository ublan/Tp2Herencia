public class Casas extends Vivienda {
    private boolean conjuntoCerrado;
    private double valorAdministracion;
    private boolean areasComunes;

    public Casas(int id, int metrosCuadrados, String direccion, int numeroHabitaciones, int numeroBanios, boolean conjuntoCerrado, double valorAdministracion, boolean areasComunes) {
        super(id, metrosCuadrados, direccion, numeroHabitaciones, numeroBanios);
        this.conjuntoCerrado = conjuntoCerrado;
        this.valorAdministracion = valorAdministracion;
        this.areasComunes = areasComunes;
    }

    public boolean isConjuntoCerrado() {
        return conjuntoCerrado;
    }

    public void setConjuntoCerrado(boolean conjuntoCerrado) {
        this.conjuntoCerrado = conjuntoCerrado;
    }

    public double getValorAdministracion() {
        return valorAdministracion;
    }

    public void setValorAdministracion(double valorAdministracion) {
        this.valorAdministracion = valorAdministracion;
    }

    public boolean isAreasComunes() {
        return areasComunes;
    }

    public void setAreasComunes(boolean areasComunes) {
        this.areasComunes = areasComunes;
    }


    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Tipo: Casa\n" +
               "Id: " + getId() + "\n" +
               "Conjunto Cerrado: " + (conjuntoCerrado ? "Sí" : "No") + "\n" +
               "Valor Administración: " + valorAdministracion + "\n" +
               "Áreas Comunes: " + (areasComunes ? "Sí" : "No");
    }
}

