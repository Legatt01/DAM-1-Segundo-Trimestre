import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorPeliculas gestor = new GestorPeliculas();
 
        cargarPeliculasIniciales(gestor);
 
        int opcion = 0;
        while (opcion != 6) {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
 
            switch (opcion) {
                case 1: agregarPelicula(gestor, scanner); break;
                case 2: buscarPorGenero(gestor, scanner); break;
                case 3: mostrarDirectores(gestor); break;
                case 4: mostrarDirectorConMasPeliculas(gestor); break;
                case 5: mostrarEstadisticas(gestor); break;
                case 6: System.out.println("¡Hasta luego!"); break;
                default: System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
 
    static void mostrarMenu() {
        System.out.println("\n===== GESTOR DE PELÍCULAS =====");
        System.out.println("1. Agregar película");
        System.out.println("2. Buscar por género");
        System.out.println("3. Ver todos los directores");
        System.out.println("4. Director con más películas");
        System.out.println("5. Estadísticas por género");
        System.out.println("6. Salir");
        System.out.print("Elige una opción: ");
    }
 
    static void cargarPeliculasIniciales(GestorPeliculas gestor) {
        gestor.agregarPelicula(new Pelicula("Inception", "Christopher Nolan", 2010,
                new HashSet<>(Arrays.asList("Ciencia Ficción", "Thriller"))));
        gestor.agregarPelicula(new Pelicula("The Dark Knight", "Christopher Nolan", 2008,
                new HashSet<>(Arrays.asList("Acción", "Drama"))));
        gestor.agregarPelicula(new Pelicula("Pulp Fiction", "Quentin Tarantino", 1994,
                new HashSet<>(Arrays.asList("Crimen", "Drama"))));
        gestor.agregarPelicula(new Pelicula("Kill Bill", "Quentin Tarantino", 2003,
                new HashSet<>(Arrays.asList("Acción", "Thriller"))));
        gestor.agregarPelicula(new Pelicula("E.T.", "Steven Spielberg", 1982,
                new HashSet<>(Arrays.asList("Ciencia Ficción", "Familia"))));
        gestor.agregarPelicula(new Pelicula("Jurassic Park", "Steven Spielberg", 1993,
                new HashSet<>(Arrays.asList("Aventura", "Ciencia Ficción"))));
        gestor.agregarPelicula(new Pelicula("Lady Bird", "Greta Gerwig", 2017,
                new HashSet<>(Arrays.asList("Comedia", "Drama"))));
        gestor.agregarPelicula(new Pelicula("Dune", "Denis Villeneuve", 2021,
                new HashSet<>(Arrays.asList("Ciencia Ficción", "Aventura"))));
    }
 
    static void agregarPelicula(GestorPeliculas gestor, Scanner scanner) {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Director: ");
        String director = scanner.nextLine();
        System.out.print("Año: ");
        int anio = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Géneros (separados por coma): ");
        String generosInput = scanner.nextLine();
        Set<String> generos = new HashSet<>(Arrays.asList(generosInput.split(",")));
        gestor.agregarPelicula(new Pelicula(titulo, director, anio, generos));
        System.out.println("Película añadida correctamente.");
    }
 
    static void buscarPorGenero(GestorPeliculas gestor, Scanner scanner) {
        System.out.print("Introduce el género a buscar: ");
        String genero = scanner.nextLine();
        List<Pelicula> encontradas = gestor.buscarPorGenero(genero);
        if (encontradas.isEmpty()) {
            System.out.println("No se encontraron películas de ese género.");
        } else {
            System.out.println("Películas encontradas:");
            for (Pelicula p : encontradas) {
                System.out.println(" - " + p);
            }
        }
    }
 
    static void mostrarDirectores(GestorPeliculas gestor) {
        String[] directores = gestor.obtenerDirectores();
        System.out.println("Directores registrados:");
        for (String d : directores) {
            System.out.println(" - " + d);
        }
    }
 
    static void mostrarDirectorConMasPeliculas(GestorPeliculas gestor) {
        String director = gestor.directorConMasPeliculas();
        if (director == null) {
            System.out.println("No hay películas registradas.");
        } else {
            System.out.println("Director con más películas: " + director);
        }
    }
 
    static void mostrarEstadisticas(GestorPeliculas gestor) {
        Map<String, Integer> estadisticas = gestor.obtenerEstadisticasGeneros();
        System.out.println("Estadísticas por género:");
        for (String genero : estadisticas.keySet()) {
            System.out.println(" - " + genero + ": " + estadisticas.get(genero));
        }
    }
}
