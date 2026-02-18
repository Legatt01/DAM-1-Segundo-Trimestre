import java.util.Scanner;

public class TransponerUnaMatriz {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = CrearRaizAleatoria(sc);
        System.out.println("Matriz original");
        imprimirMatriz(matriz);
        System.out.println("\n Matriz Transpuesta");
        imprimirMatriz(transponerMatriz(matriz));
    }

    public static int[][] transponerMatriz(int[][] matriz){
     int[][] matrizTranspuesta = new int[matriz[0].length][matriz.length];
     for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            matrizTranspuesta[j][i] = matriz[i][j];
        }
     }
     return matrizTranspuesta;
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

    public static void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%3d",
                    matriz[i][j]
                );
            }
            System.out.println();
        }
    }    
}
