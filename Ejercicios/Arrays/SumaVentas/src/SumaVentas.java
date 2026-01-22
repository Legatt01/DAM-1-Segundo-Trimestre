import java.util.Scanner;

public class SumaVentas {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int[] ventas = pedirArrayInt(sc);

        for (int i = 0; i < ventas.length; i++) {
            suma += ventas[i];
        }
        sc.close();

    }

    public static int[] pedirArrayInt(Scanner sc){
        System.err.println("Dime cuantos numeros me vas a dar");
        int numDatos = Integer.parseInt(sc.nextLine());

        int[] numeros = new int[numDatos];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dime el número " + (i+1) + ": ");
            numeros[i] = Integer.parseInt(sc.nextLine());
        }
        return numeros;
    }
}
