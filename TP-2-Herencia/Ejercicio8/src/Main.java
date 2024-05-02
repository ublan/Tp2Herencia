public class Main {

    public static void main(String[] args) {
        Posnet posnet = new Posnet();

        String tipoTarjeta = "Visa";
        String nombreBanco = "Banco Santander";
        String numeroTarjeta = "1234-5678-9012-3456";
        double saldoDisponible = 15000.0;
        int dni = 12345678;
        String nombre = "Uriel";
        String apellido = "Blanco";
        int telefono = 123456789;
        String email = "uriel.blanco@gmail.com";

        TarjetaCredito tarjeta = new TarjetaCredito(tipoTarjeta, nombreBanco, numeroTarjeta, saldoDisponible, dni, nombre, apellido, telefono, email);

        double montoPago = 10000.0;
        int cuotasPago = 5;
        Ticket ticket = posnet.efectuarPago(montoPago, cuotasPago, tarjeta, nombre, apellido, telefono, email);

        if (ticket != null) {
            System.out.println("Pago realizado con éxito:");
            System.out.println(ticket);
            System.out.println("Tu monto saldo restante es de $" + (saldoDisponible - montoPago));
        } else {
            System.out.println("No se pudo realizar el pago debido a saldo insuficiente.");
        }
    }
}
