public class Posnet {

    public Ticket efectuarPago(double monto, int cuotas, TarjetaCredito tarjeta, String nombre, String apellido, int telefono, String email) {
        if (tarjeta.getSaldoSuficiente(monto,  cuotas)) {
            double montoTotal = calcularMontoTotal(monto, cuotas);
            tarjeta.setSaldo(tarjeta.getSaldo() - montoTotal);
            return new Ticket(nombre, apellido, montoTotal, cuotas);
        } else {
            return null;
        }
    }

    private double calcularMontoTotal(double monto, int cuotas) {
        double recargo = (cuotas > 1) ? 0.03 * (cuotas - 1) * monto : 0;
        return monto + recargo;
    }
}
