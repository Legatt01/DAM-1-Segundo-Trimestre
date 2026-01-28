import java.util.Scanner;

public class OrdenarParesImpares {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] numeros = pedirArrayInt(sc);
        int[] ordenados = new int [numeros.length];
        int j = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0)
                ordenados[j] = numeros[i];
                j++;
            if (numeros[i] % 2 != 0) {
                
            }
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
