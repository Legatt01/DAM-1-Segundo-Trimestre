import java.util.Scanner;

public class Appnotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        conversorNotas nota = new conversorNotas(0);
        boolean valida = false;
        while (!valida) {
            System.out.println("Dime tu nota:");
            try {
                int valor = Integer.parseInt(sc.nextLine());
                nota.setNotas(valor);
                System.out.println(nota.conversor());
                valida = true;
            } catch (NotaFueraDeRangoException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes introducir un número entero válido.");
            } finally {
                if (valida) {
                    System.out.println("Muchas gracias por usar la aplicaciónr");
                } else{
                    System.out.println("Vuelve a intentarlo"); 
                }
            }
        }
        sc.close();

    }
}