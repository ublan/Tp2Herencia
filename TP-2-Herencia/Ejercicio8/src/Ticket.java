public class Ticket {
    private String nombreCliente;
    private String apellidoCliente;
    private double montoTotal;
    private int cuotas;

    public Ticket(String nombreCliente, String apellidoCliente, double montoTotal, int cuotas) {
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.montoTotal = montoTotal;
        this.cuotas = cuotas;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }
    
    @Override
public String toString() {
    return "Ticket de Compra:\n" +
           "Nombre Cliente: " + nombreCliente + "\n" +
           "Apellido Cliente: " + apellidoCliente + "\n" +
           "Monto Total: $" + montoTotal + "\n" +
           "Cuotas: " + cuotas;
}

}
