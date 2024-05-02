public class Administrativos extends Trabajodores {
    
    private int horasTrabajadas;

    public Administrativos(String nombre, int dni, String domicilio, int fechaingreso,  double sueldo, int horasTrabajadas) {
        super(nombre, dni, domicilio, fechaingreso, sueldo);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getSueldoxHoras() {
        return horasTrabajadas * 4600; //Se me ocurrio que el sueldo por hora era de 4600 y que saque el promedio a la horas que trabaje

    }

    @Override
    public String toString() { 
        return super.toString() + "\nCargo: Administrativo " + "\nHoras trabajadas: $" + getSueldoxHoras()  + "\nTotal a cobrar: $" + (getSueldo() + getSueldoxHoras());
    }
}
