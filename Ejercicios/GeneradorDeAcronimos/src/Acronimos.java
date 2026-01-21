import java.util.Scanner;

public class Acronimos {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String texto;
    String palabraActual = "";
    String resultado = "";

    System.out.println("dame el texto de donded quieres que toma las iniciales: ");
    texto = sc.nextLine() + "";

    for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            // Si no es un espacio, estamos formando una palabra
            if (letra != ' ') {
                palabraActual += letra;
            } 
            // Si encontramos un espacio, significa que la palabra terminó
            else {
                if (!palabraActual.equals("")) {
                    // Convertimos a minúsculas para comparar
                    String minus = palabraActual.toLowerCase();
                    
                    // Comprobamos si NO es una de las palabras a ignorar
                    if (!minus.equals("de") && !minus.equals("la") && 
                        !minus.equals("el") && !minus.equals("y")) {
                        
                        // Si es válida, guardamos su primera letra en mayúscula
                        resultado += Character.toUpperCase(palabraActual.charAt(0));
                    }
                    palabraActual = ""; // Limpiamos para la siguiente palabra
                }
            }
        }

        System.out.println("Iniciales: " + resultado);

        sc.close();

    }
}
