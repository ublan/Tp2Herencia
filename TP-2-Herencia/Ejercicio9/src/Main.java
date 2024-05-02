public class Main {
    public static void main(String[] args) {

        Vendedores vendedor = new Vendedores("Matias Ramirez", 123456789, "123 Main St", 2021, 650000.0, 0.05);
        
        System.out.println(vendedor);

        System.out.println("------------------------------------");

        Administrativos administrativo = new Administrativos("Micaela Martinez", 123456789, "123 south St", 2022, 0.0, 120);

        System.out.println(administrativo);

        System.out.println("------------------------------------");

        Repartidores repartidor = new Repartidores("Juan Perez", 123456789, "123 col St", 2023, 650000.0 , 15);

        System.out.println(repartidor);
    }
}
