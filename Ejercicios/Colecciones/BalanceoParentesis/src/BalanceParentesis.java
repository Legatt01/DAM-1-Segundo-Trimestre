import java.util.*;

public class BalanceParentesis {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame una expresión: ");
        String texto = sc.nextLine();

        System.out.println((estaBalanceada(texto) ? "Está balanceada" : "NO está balanceada"));
        sc.close();
    }

    public static boolean estaBalanceada(String expresion) {
        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < expresion.length(); i++) {
            if(expresion.charAt(i) == '(' || expresion.charAt(i) == '{')
                pila.push(expresion.charAt(i));

            if(expresion.charAt(i) == ')' || expresion.charAt(i) == '}') {
                if(!pila.isEmpty()){
                    Character c = pila.pop();
                    if(c == '(' && expresion.charAt(i) == '}')
                        return false;
                    if(c == '{' && expresion.charAt(i) == ')')
                        return false;

                }
                else
                    return false;
            }
        }
        if(pila.isEmpty())
            return true;
        else
            return false;
    }
}
