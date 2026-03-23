import java.util.ArrayList;
import java.util.Scanner;

public class EliminarImpares {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = pedirLista(sc);

        System.out.println("La lista completa: " + lista);
        System.out.println("La lista sin impares: " + eliminarImpares(lista));
    }
    public static ArrayList<Integer> eliminarImpares(ArrayList<Integer> lista){
        ArrayList<Integer> nueva = new ArrayList<>();

        for (Integer numero : lista) {
            if(numero % 2 == 0);
                nueva.add(numero);
        }
        return nueva;
    }
    public static ArrayList<Integer> pedirLista(Scanner sc) {
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.print("Dime cúantos números me vas a dar: ");
        int num = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < num; i++) {
            System.out.print("Dime el número " + (i+1) + ": ");   
            lista.add(Integer.parseInt(sc.nextLine()));
        }

        return lista;
    }
}
