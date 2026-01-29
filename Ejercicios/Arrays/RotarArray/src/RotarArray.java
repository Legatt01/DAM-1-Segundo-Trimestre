import java.util.Arrays;
import java.util.Scanner;

public class RotarArray {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] array = pedirArrayInt(sc);
        System.out.println("Cuantas posiciones quieres rotar");
        int posiciones = Integer.parseInt(sc.nextLine());
        System.out.println("En que sentido quieres rotar (d/i)");
        boolean sentido = sc.nextLine().equalsIgnoreCase("d");
        int[] rotado = rotarArray(array, posiciones, sentido);
        System.out.printf("El array %s rotado %d posiciones a la %s es %s.",
        Arrays.toString(array), 
        posiciones,
        sentido ? "derecha" : "izquierda", 
        Arrays.toString(rotado));
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
    public static int[] rotarArray(int[] array, int posiciones, boolean sentido){
        int[] resultado = new int[array.length];
        for (int i = 0; i < resultado.length; i++) {
            if (sentido) {
                if (i + posiciones < resultado.length) {
                    resultado[i] = array[i + posiciones];
                } else {
                    resultado[i] = array[i + posiciones - resultado.length];
                }
            } else {
                if (i - posiciones >= 0) {
                    resultado[i] = array[i - posiciones];
                } else {
                    resultado[i] = array[i - posiciones + resultado.length];
                }
            }
        } return resultado;
    }
}
