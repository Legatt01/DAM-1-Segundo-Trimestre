import java.util.Scanner;

public class MatrizEspiral {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = CrearRaizAleatoria(sc);
        System.out.println("Aqui tienes tu raiz espiral");
        imprimirMatriz(matriz);
    }

    public static int[][] CrearRaizAleatoria(Scanner sc) {
        System.out.println("Dame el numero de columnas y filas");
        int columnas = Integer.parseInt(sc.nextLine()), filas = Integer.parseInt(sc.nextLine());
        System.out.println("Dame el rango maximo");
        int rango = Integer.parseInt(sc.nextLine());
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = columnas -1; j < columnas; j++) {
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
