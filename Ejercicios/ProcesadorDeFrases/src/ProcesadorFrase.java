import java.util.Scanner;
import java.util.StringTokenizer;

public class ProcesadorFrase {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.println("Dime tu frase: ");
        frase = sc.nextLine();
        System.out.println(frase.trim().replace("a", "@"));
        StringTokenizer token = new StringTokenizer(frase);
        String resultado = "";
        
        while (token.hasMoreTokens()) {
            String palabra = token.nextToken();
            resultado = palabra + " " + resultado;
        }
        System.out.println("el resultado es: \"" + resultado.trim());
    sc.close();
    }
}
