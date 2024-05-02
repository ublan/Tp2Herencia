public class Repartidores extends Trabajodores {
    
    private int repartos;
    
    public Repartidores(String nombre, int dni, String domicilio, int fechaingreso, double sueldo, int repartos) {
        super(nombre, dni, domicilio, fechaingreso, sueldo);
        this.repartos = repartos;   
    }
    
    public int getRepartos() {
        return repartos;
    }
    
    public void setRepartos(int repartos) {
        this.repartos = repartos;
    }
    
    public int getVentasxReparto() {
        return repartos * 500;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCargo: Repartidor " + "\nRepartos: $" + getVentasxReparto()  + "\nTotal a cobrar: $" + (getSueldo() + getVentasxReparto());
    }
}


    

