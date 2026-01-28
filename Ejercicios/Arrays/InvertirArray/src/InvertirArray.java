import java.util.Arrays;
import java.util.Scanner;

public class InvertirArray {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] numeros = pedirArrayInt(sc);

        int[] resultado = invertir(numeros);

        System.out.printf("El array %s invertido es %s.",
            Arrays.toString(numeros), Arrays.toString(resultado)
        );
        sc.close();
    }

    public static int[] invertir(int[] array) {
        int[] invertido = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            invertido[i] = array[array.length - 1 - i];   
        }

        return invertido;
    }

    public static int[] pedirArrayInt(Scanner sc) {
        System.out.print("Dime cuántos números me vas dar: ");
        int numDatos = Integer.parseInt(sc.nextLine());

        int[] numeros = new int[numDatos];
        for(int i = 0; i < numDatos; i++) {
            System.out.print("Dime el número " + (i+1) + ": ");
            numeros[i] = Integer.parseInt(sc.nextLine());
        }
        return numeros;
    }    
}
