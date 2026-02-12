import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExpandirUnArray {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] array = crearArrayAleatorio(sc);
        double[] media = arraysmedias(array);
        System.out.println(Arrays.toString(array));
        double[] arrayExpandido = expandirArray(array, media);
        System.out.println(Arrays.toString(arrayExpandido));
        sc.close();
    }
    public static double[] arraysmedias(int[] array) {
        double[] media = new double[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            media[i] = (double) array[i];
            media[i] = (media[i] + array[i + 1]) / 2;
        }
        return media;
    }
    public static double[] expandirArray(int[] array, double[] media) {
        int posicionArrayExpandido = 0;
        int tamano = array.length + media.length;
        double[] arrayExpandido = new double[tamano];
        for (int i = 0; i < array.length; i++) {
            arrayExpandido[posicionArrayExpandido++] = (double) array[i];
            if (i < array.length - 1) {
                arrayExpandido[posicionArrayExpandido++] = (double) media[i];
            }
        }
        return arrayExpandido;
    }
    public static int[] crearArrayAleatorio(Scanner sc) {
        System.out.print("Dime de cúantos elementos quieres el array: ");
        int tamano = Integer.parseInt(sc.nextLine());
        System.out.print("Dime el rango máximo de los números: ");
        int rango = Integer.parseInt(sc.nextLine());
        Random rand = new Random();
        int[] array = new int[tamano];
        for (int i = 0; i < array.length; i++) {
            int nuevoNum;
            do {
                nuevoNum = rand.nextInt(rango);
            } while (isIn(array, nuevoNum));
            array[i] = nuevoNum;
        }
        return array;
    }

    public static boolean isIn(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num)
                return true;
        }
        return false;
    }
}

