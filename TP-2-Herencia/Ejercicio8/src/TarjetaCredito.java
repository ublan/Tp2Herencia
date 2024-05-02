public class TarjetaCredito {

    private String tipo;
    private String nombreBanco;
    private String numeroTarjeta;
    private double saldo;
    private int dni;
    private String nombre;
    private String apellido;
    private int telefono;
    private String email;

    public TarjetaCredito(String tipo, String nombreBanco, String numeroTarjeta, double saldo, int dni, String nombre, String apellido, int telefono, String email) {
        this.tipo = tipo;
        this.nombreBanco = nombreBanco;
        this.numeroTarjeta = numeroTarjeta;
        this.saldo = saldo;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;   
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getSaldoSuficiente(double monto,int cuotas) {
        
        if (saldo >= monto) {
            saldo -= monto;
            return true; 
        } else {
            return false;
        }
    }

}
