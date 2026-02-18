import java.util.Scanner;

public class RotarMatriz {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = CrearRaizAleatoria(sc);
        System.out.println("Array Original");
        imprimirMatriz(matriz);
        System.out.println("\nArray Girado");
        imprimirMatriz(girar(matriz));
    }

    public static int[][] girar(int[][] matriz){
        int[][] girar = new int[matriz.length][matriz.length];

        for (int i = 0; i < girar.length; i++) {
            for (int j = 0; j < girar.length; j++) {
                girar[j][matriz.length - 1 - i] = matriz[i][j];
            }
        }
        return girar(matriz);
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
