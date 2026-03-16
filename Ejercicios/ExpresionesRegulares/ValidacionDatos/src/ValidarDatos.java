import java.util.Scanner;

public class ValidarDatos {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nombre, fecha, dni, email;

        do {
            System.out.print("Dime el nombre: ");
            nombre = sc.nextLine();           
        } while (!esNombre(nombre));

        do {
            System.out.print("Dime la fecha de nacimiento: ");
            fecha = sc.nextLine();           
        } while (!esFecha(fecha));
        

        do {
            System.out.print("Dime el DNI: ");
            dni = sc.nextLine();           
        } while (!esDni(dni));

        do {
            System.out.print("Dime el email: ");
            email = sc.nextLine();           
        } while (!esEmail(email));

        sc.close();
    }

    public static boolean esNombre(String nombre) {
        return nombre.matches("([A-ZÑÁÉÍÓÚ][a-zñáéíóú]{2,} ){1,}([A-ZÑÁÉÍÓÚ][a-zñáéíóú]{2,})");
    }

    public static boolean esFecha(String fecha) {
        return fecha.matches("(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/(20[0-9]{2}|19[5-9][0-9])");
    }

    public static boolean esDni(String dni) {
        return dni.matches("[0-9]{8}[A-Z]");
    }

    public static boolean esEmail(String email) {
        return email.toLowerCase().matches("[a-z][a-z0-9_.-]{2,32}@[a-z][a-z0-9_.-]{2,32}\\.[a-z]{2,32}");
    }
}