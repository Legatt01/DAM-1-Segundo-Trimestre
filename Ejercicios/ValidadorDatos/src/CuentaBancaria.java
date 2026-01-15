package Ejercicios.ValidadorDatos.src;

public class CuentaBancaria {
    
    private double saldo;
    public CuentaBancaria(double saldo){
        this.saldo = saldo;
        
    }
    public double getSaldo() {
        return saldo;
    }

    public void retirar(double cantidad) throws SaldoInsuficienteException{
        if(cantidad < 0){
            throw new IllegalArgumentException("Cantidad negativa");
        }
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo Insuficiente");  
        }
        saldo -= cantidad;
    }
}
