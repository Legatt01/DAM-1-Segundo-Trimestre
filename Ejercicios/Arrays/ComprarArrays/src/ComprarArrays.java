import java.util.Arrays;
import java.util.Scanner;

public class ComprarArrays {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] array1 = pedirArrayInt(sc);
        int[] array2 = pedirArrayInt2(sc);
        boolean iguales = comprarArrays(array1, array2);
        System.out.printf("Los arrays %s y %s son %s.", Arrays.toString(array1), Arrays.toString(array2), iguales ? "iguales" : "distintos");
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
    public static int[] pedirArrayInt2(Scanner sc) {
        System.out.print("Dime cuántos números me vas dar: ");
        int numDatos = Integer.parseInt(sc.nextLine());

        int[] numeros = new int[numDatos];
        for(int i = 0; i < numDatos; i++) {
            System.out.print("Dime el número " + (i+1) + ": ");
            numeros[i] = Integer.parseInt(sc.nextLine());
        }
        return numeros;
    }
    public static boolean comprarArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
