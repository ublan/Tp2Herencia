public class Trabajodores {

    private String nombre;
    private int dni;
    private String domicilio;
    private int fechaingreso;
    private double sueldo;

    public Trabajodores(String nombre, int dni, String domicilio, int fechaingreso, double sueldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.fechaingreso = fechaingreso;
        this.sueldo = sueldo;
    }   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {  
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(int fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSuelda(double sueldo) {
        this.sueldo = sueldo;
    }


    @Override
    public String toString() {
        return "Trabajador:\n" +
               "Nombre: '" + nombre + "'\n" +
               "Dni: '" + dni + "'\n" +
               "Domicilio: '" + domicilio + "'\n" +
               "FechaIngreso: '" + fechaingreso + "'\n" +
               "Sueldo basico: $" + sueldo;
    }
}
