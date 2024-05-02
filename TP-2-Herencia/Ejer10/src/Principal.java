import java.text.DecimalFormat;

public class Principal {

    public static void main(String[] args) {
        // Crear dos inmuebles
        Inmueble inmueble1 = new Casas(11, 150, "Calle 123", 3, 2, true, 2000.0, true);
        Inmueble inmueble2 = new LocalComercial(20, 80, "Avenida Principal", "Externo", "Centro Comercial XYZ", false);

        // Calcular precio de venta
        double precioVenta1 = calcularPrecioVenta(inmueble1);
        double precioVenta2 = calcularPrecioVenta(inmueble2);

        // Formatear los precios de venta
        DecimalFormat formatoMoneda = new DecimalFormat("#,##0.00");
        String precioFormateado1 = formatoMoneda.format(precioVenta1);
        String precioFormateado2 = formatoMoneda.format(precioVenta2);

        // Mostrar datos de los inmuebles
        System.out.println("Datos del Inmueble 1:");
        System.out.println(inmueble1);
        System.out.println("Precio de Venta: $" + precioFormateado1);
        System.out.println();

        System.out.println("Datos del Inmueble 2:");
        System.out.println(inmueble2);
        System.out.println("Precio de Venta: $" + precioFormateado2);
    }

    private static double calcularPrecioVenta(Inmueble inmueble) {
        double precioMetroCuadrado = obtenerValorMetroCuadrado(inmueble);
        return precioMetroCuadrado * inmueble.getMetrosCuadrados();
    }
    // Método para obtener el valor del metro cuadrado según el tipo de inmueble
    public static double obtenerValorMetroCuadrado(Inmueble inmueble) {
        if (inmueble instanceof Casas) {
            return obtenerValorMetroCuadradoCasas((Casas) inmueble);
        } else if (inmueble instanceof LocalComercial) {
            return obtenerValorMetroCuadradoLocalComercial((LocalComercial) inmueble);
        }
        // Si no se reconoce el tipo de inmueble, se devuelve un valor predeterminado
        return 0.0;
    }

    // Método para obtener el valor del metro cuadrado para casas
    public static double obtenerValorMetroCuadradoCasas(Casas casa) {
        if (casa.isConjuntoCerrado()) {
            return 2500000; // Valor para casa en conjunto cerrado
        } else {
            return 2000000; // Valor para casa independiente
        }
    }

    // Método para obtener el valor del metro cuadrado para locales comerciales
    public static double obtenerValorMetroCuadradoLocalComercial(LocalComercial localComercial) {
        return 3000000; // Valor para local comercial
    }
}
