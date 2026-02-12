import java.util.Arrays;
import java.util.Scanner;

public class ConversionDeTipos {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] array1 = pedirArrayInt(sc);
        String[] enLetras = { "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez" };
        String[] array2 = conversorArray(array1, enLetras);
        System.out.println(Arrays.toString(array2));
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

    public static String[] conversorArray(int[] array1, String[] enLetras) {
        String[] array2 = new String[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = enLetras[array1[i]];
        }
        return array2;
    }
}
