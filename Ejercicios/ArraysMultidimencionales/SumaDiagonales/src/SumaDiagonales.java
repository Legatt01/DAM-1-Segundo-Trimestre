import java.util.Scanner;

public class SumaDiagonales {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = CrearRaizAleatoria(sc);
        int d1 = 0;
        int d2 = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matriz.length; i++) {
            d1 = d1 + matriz[i][i];
            d2 = d2 + matriz[i][matriz.length - 1 - i];
        }
        System.out.println("Suma diagonal 1: " + d1);
        System.out.println("Suma diagonal 2: " + d2);
    }

    public static int[][] CrearRaizAleatoria(Scanner sc) {
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
}
