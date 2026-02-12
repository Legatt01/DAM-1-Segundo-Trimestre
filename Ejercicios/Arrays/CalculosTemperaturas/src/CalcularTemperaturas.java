import java.util.Scanner;

public class CalcularTemperaturas {
    public static void main(String[] args) throws Exception {
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        Scanner sc = new Scanner(System.in);
        double[] temperaturas = new double[7];

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Dame la temperatura para el " + diasSemana[i] + ": ");
            temperaturas[i] = Double.parseDouble(sc.nextLine());
        }
        int posMax = 0;
        double tempMax = temperaturas[posMax];
        int posMin = 0;
        double tempMin = temperaturas[posMin];
        double suma = temperaturas[0];

        for (int i = 1; i < temperaturas.length; i++) {
            if(tempMax < temperaturas[i]) {
                tempMax = temperaturas[i];
                posMax = i;
            }
            if(tempMin > temperaturas[i]) {
                tempMin = temperaturas[i];
                posMin = i;
            }
            suma += temperaturas[i];
        }
        System.out.printf("La temperatura máxima fue de %.1fºC y se dió el %s.\n",
            tempMax, diasSemana[posMax]
        );
        System.out.printf("La temperatura mínima fue de %.1fºC y se dió el %s.\n",
            tempMin, diasSemana[posMin]
        );
        System.out.printf("La temperatura media fue de %.1fºC.",
            suma / 7
        );
        sc.close();
    }
}
