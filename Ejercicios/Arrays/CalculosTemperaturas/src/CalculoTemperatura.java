import java.util.Scanner;

public class CalculoTemperatura {
    public static void main(String[] args) throws Exception {
        int suma = 0;
        double promedio = suma / pedirArrayInt(null).length;
        double[] sumatorio = pedirArrayInt(null);

        for (int i = 0; i < sumatorio.length; i++) {
            suma += sumatorio[i];
        }

    }
    public static double[] pedirArrayInt(Scanner sc){
        System.err.println("Dime cuantos numeros me vas a dar");
        int numDatos = Integer.parseInt(sc.nextLine());
        double[] numeros = new double[numDatos];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dime el número " + (i+1) + ": ");
            numeros[i] = Double.parseDouble(sc.nextLine());
        }
        return numeros;
    }
}
