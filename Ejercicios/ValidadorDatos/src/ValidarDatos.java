package Ejercicios.ValidadorDatos.src;

public class ValidarDatos {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        try {
            cuenta.retirar(-1);
            cuenta.retirar(1500);
        } catch (IllegalArgumentException e) {
            System.out.println("Error controlado: " + e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error controlado: " + e.getMessage());
        }
    }

}
