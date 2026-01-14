import java.util.Scanner;

public class CalculadoraSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        int opc = 0;
        do {
            menu();
            try {
                opc = Integer.parseInt(sc.nextLine());
                if (opc != 0) {
                    System.out.println("Dame el primer numero");
                    a = Integer.parseInt(sc.nextLine());
                    System.out.println("Dame el segundo nuemero");
                    b = Integer.parseInt(sc.nextLine());

                }
                switch (opc) {
                    case 1:
                        int sumar = a + b;
                        System.out.println("Haz elegido sumar");
                        System.out.println("El resultado es: " + sumar);
                        break;
                    case 2:
                        int restar = a - b;
                        System.out.println("Haz elegido restar");
                        System.out.println("El resultado es: " + restar);
                        break;
                    case 3:
                        int multiplicar = a * b;
                        System.out.println("Haz elegido multiplicar");
                        System.out.println("El resultado es: " + multiplicar);
                    case 4:
                        int dividir = a / b;
                        System.out.println("Haz elegido multiplicar");
                        System.out.println("El resultado es: " + dividir);
                    default:
                        break;
                }
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir por 0");
            } catch (NumberFormatException e) {
                System.out.println("No se admiten caracteres");
            }

        } while (opc != 0);
        System.out.println("Muchas gracias por usar nuestro programa");
        sc.close();

    }

    public static void menu() {
        System.out.println("\n1.- Sumar");
        System.out.println("2.- Restar");
        System.out.println("3.- Multiplicar");
        System.out.println("4.- Dividir");
        System.out.println("0.- Salir");
        System.out.println("Seleciona una opción: ");

    }
}
