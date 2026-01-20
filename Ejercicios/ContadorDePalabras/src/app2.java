import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto, palabra;
        int posicion = 0, contador = 0;

        System.out.print("Dame el texto completo: ");
        texto = sc.nextLine();
        System.out.print("Dame la palabra a buscar: ");
        palabra = sc.nextLine();

        do {
            posicion = texto.indexOf(palabra, posicion);
            if(posicion != -1) {
                contador++;
                posicion++;
            }
           
        } while (posicion != -1);

        System.out.println("Tu palabra aparece " + contador + " veces");

        System.out.print("Quieres sustituir la palabra (s/n)? ");
        if(sc.nextLine().toLowerCase().equals("s")) {
            System.out.print("Dime la palabra nueva: ");
            String nuevaPalabra = sc.nextLine();

            String nuevoTexto = texto.replace(palabra, nuevaPalabra);
            System.out.println("El nuevo texto es:\n" + nuevoTexto);
        }
     sc.close();   
    }
}
