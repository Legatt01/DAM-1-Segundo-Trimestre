import java.util.Scanner;

public class IntercambioDeMitades {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] array1 = pedirArrayInt(sc);
        int[] array2 = pedirArrayInt(sc);
        int[] array3 = new int[array1.length + array2.length];
        
        System.out.println("Hello, World!");
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
    public static int[] intercambiarMitades(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        int[] mitad1 = new int[array1.length / 2];
        int[] mitad2 = new int[array2.length / 2];
        if (array1.length % 2 != 0 || array2.length % 2 != 0) {
            return null;
        }
        
    
}
