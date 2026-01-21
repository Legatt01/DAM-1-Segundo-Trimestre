import java.util.Scanner;
import java.util.StringTokenizer;

public class Acronimostoken {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("Dame la frase: ");
    String frase = sc.nextLine();

    StringTokenizer tokens = new StringTokenizer(frase);
    String acronimo = "";
    while (tokens.hasMoreTokens()) {
        String palabra = tokens.nextToken();
        if (palabra.length() > 3) {
            if (!palabra.equals(palabra.toUpperCase())) {
                acronimo += palabra.substring(0,1).toUpperCase();
            }
        }
        
    }
    System.out.printf("El acrónimo de \"%s\" es %s", frase, acronimo);

        sc.close();

    }
}
