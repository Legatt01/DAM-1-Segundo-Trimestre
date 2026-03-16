import java.util.Scanner;
import java.util.TreeSet;

public class MaxMin {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> conjunto = new TreeSet<>();

        int[][] miMatriz = CrearMatrizAleatoria(sc);
        imprimirMatriz(miMatriz);

        for (int i = 0; i < miMatriz.length; i++) {
            for (int j = 0; j < miMatriz[i].length; j++) {
                conjunto.add(miMatriz[i][j]);
            }
        }

        System.out.println("El maximo es: " + conjunto.last());
        System.out.println("El minimo es: " + conjunto.first());

    }
     public static int[][] CrearMatrizAleatoria(Scanner sc) {
        System.out.println("Dame el numero de columnas");
        int columnas = Integer.parseInt(sc.nextLine());
        System.out.println("Dame el numero de filas");
        int filas = Integer.parseInt(sc.nextLine());
        System.out.println("Dame el rango maximo");
        int rango = Integer.parseInt(sc.nextLine());
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * (rango + 1));
            }
        }
        return matriz;
    }
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%3d",
                        matriz[i][j]);
            }
            System.out.println();
        }
    }
}
