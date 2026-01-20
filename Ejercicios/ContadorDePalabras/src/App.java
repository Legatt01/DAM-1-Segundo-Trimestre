import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opc;
        int posicion = 0, contador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el texto: ");
        String texto = sc.nextLine();
        do {
            menu();
            opc = Integer.parseInt(sc.nextLine());
            switch (opc) {
                case 1:
                    WordFinder(Scanner sc, S)
                    break;
                case 2:

                case 3:
            
                default:
                    break;
            }
            
        } while (opc != 0);
    System.out.println("Programa finalizado correctamente");
    sc.close();

    }
    public static void menu(){
        System.out.println("=== MENÚ ===\n" + //
                "1. WordFinder\n" + //
                "2. WordChanger\n" + //
                "0. Salir.\n");
        System.out.println("Seleccion: ");
    }

    public static void WordFinder(Scanner sc, String texto, int posicion, int contador){
        System.out.println("Dime la palabra que quieres buscar: ");
        String word = sc.nextLine();
        do {
            posicion = texto.indexOf(word, posicion);
        } while (condition);
    }
}
