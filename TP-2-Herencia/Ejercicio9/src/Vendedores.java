public class Vendedores extends Trabajodores {
    
    private double comision;
    
    public Vendedores(String nombre, int dni, String domicilio, int fechaingreso, double sueldo  ,double comision) {
        super(nombre, dni, domicilio, fechaingreso, sueldo);
        this.comision = comision;
    }
    
    public double getComision() {
        return comision;
    }
    
    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getComisiones() {
        return getSueldo() * (0.05);
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nCargo: Vendedor " + "\nComision por ventas: " + getComisiones() + "\nTotal a cobrar: $" + (getSueldo() + getComisiones());
    }
}
