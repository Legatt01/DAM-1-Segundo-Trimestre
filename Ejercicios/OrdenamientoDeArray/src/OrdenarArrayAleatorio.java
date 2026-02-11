import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OrdenarArrayAleatorio {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] numeros = crearArrayAleatorio(sc);

        System.out.printf("El array %s odenador es %s.",
            Arrays.toString(numeros),
            Arrays.toString(ordenar(numeros))
        );
        sc.close();
    }

    public static int[] ordenar(int[] array){
        boolean huboCambios;
        do {
            huboCambios = false;
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i+1]) {
                    int tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp; 
                    huboCambios = true;
                }
            }           
        } while (huboCambios);

        return array;
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
            } while(isIn(array, nuevoNum));
            array[i] = nuevoNum; 
        }
        return array;
    }

    public static boolean isIn(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == num)
                return true;
        }
        return false;
    }
}