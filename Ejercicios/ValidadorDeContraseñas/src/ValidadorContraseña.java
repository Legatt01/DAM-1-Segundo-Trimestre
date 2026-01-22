import java.util.Scanner;

public class ValidadorContraseña {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String texto;
        Boolean valida = false;
        System.out.println("Dame tu nueva contraseña: ");
        texto = sc.nextLine();
        if (texto.length() >= 8 && texto.contains(" ") && texto.substring(0,1).equals(texto.substring(0,1).toUpperCase()) && Character.isDigit(texto.charAt(texto.length() - 1 )) ) {
            valida = true;
            System.out.println("La contraseña ha sido cambiada");
            valida = false;
        }else{
            System.out.println("La contraseña no es valida, intentalo de nuevo");
        }
        sc.close();
    }
}
