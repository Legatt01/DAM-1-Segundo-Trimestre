import java.util.ArrayList;
import java.util.Scanner;

public class SumaElementos {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listaNumeros = pedirLista(sc);
        int suma = 0;

        for (Integer numero : listaNumeros) {
            suma += numero;
        }
        System.out.println("La suma de los numero sde la lista es: " + suma);
    }
    public static ArrayList<Integer> pedirLista(Scanner sc){
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Dime cuantos numero me vas a dar: ");
        int num = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < num; i++) {
            System.out.println("Dime el número " + (i+1) + ": ");
            lista.add(Integer.parseInt(sc.nextLine()));
        }

        return lista;
    }
}
