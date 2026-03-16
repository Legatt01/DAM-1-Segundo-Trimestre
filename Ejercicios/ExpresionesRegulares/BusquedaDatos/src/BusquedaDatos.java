import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BusquedaDatos {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String fecha;

        System.out.println("Dime un texto que contanga varias fechas en formato dd/mm/aaaa");
        fecha = sc.nextLine();

        // Suponemos que "texto" contiene el texto a analizar
        Pattern patron = Pattern.compile("(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/(20[0-9]{2}|[0-19][0-9]{2})");
        Matcher acoplamiento = patron.matcher(fecha);
        boolean patronEncontrado;
        int numVeces = 0;
        do {
            patronEncontrado = acoplamiento.find();
            if (patronEncontrado) {
                numVeces++;
                int inicio = acoplamiento.start();
                int fin = acoplamiento.end();
                System.out.printf("%2d.- fecha encontrada entre posiciones %d y %d: %s\n",
                        numVeces, inicio, fin, fecha.substring(inicio, fin));
            }
        } while (patronEncontrado);
        if (numVeces == 0) {
            System.out.println("No se encontraron números enteros.");
        } else {
            System.out.printf("Encontrado %d veces.", numVeces);
        }

        sc.close();
    }
}
