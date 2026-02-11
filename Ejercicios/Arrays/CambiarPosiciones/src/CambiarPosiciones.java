import java.util.Scanner;

public class CambiarPosiciones {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] array = pedirArrayInt(sc);
        int[] array2 = Posiciones(sc, array.length);
        System.out.println("Hello, World!");
    }

    public static int[] pedirArrayInt(Scanner sc) {
        System.out.print("Dime cuántos números me vas dar: ");
        int numDatos = Integer.parseInt(sc.nextLine());

        int[] numeros = new int[numDatos];
        for (int i = 0; i < numDatos; i++) {
            System.out.print("Dime el número " + (i + 1) + ": ");
            numeros[i] = Integer.parseInt(sc.nextLine());
        }
        return numeros;
    }

    public static int[] Posiciones(Scanner sc, int longitud) {
        System.out.print("Ahora dame las posiciones: ");
        int[] posiciones = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            System.out.print("Posición " + (i + 1) + ": ");
            posiciones[i] = Integer.parseInt(sc.nextLine());
        }
        return posiciones;
    }
}
