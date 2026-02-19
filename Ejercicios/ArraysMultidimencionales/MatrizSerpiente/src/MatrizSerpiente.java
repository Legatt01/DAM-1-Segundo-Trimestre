import java.util.Scanner;

public class MatrizSerpiente {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aqui tienes tu raiz espiral");
        imprimirMatriz(CrearRaizAleatoria(sc));
        sc.close();
    }

    public static int[][] CrearRaizAleatoria(Scanner sc) {
        System.out.println("Dame el numero de columnas y filas");
        int n = Integer.parseInt(sc.nextLine());
        int[][] matriz = new int[n][n];
        int contador = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {// de izquierda a derecha
                for (int j = 0; j < n; j++) {
                    matriz[i][j] = contador++;
                }
            } else {// de derecha a izquierda
                for (int j = n - 1; j >= 0; j--) {
                    matriz[i][j] = contador++;
                }
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
