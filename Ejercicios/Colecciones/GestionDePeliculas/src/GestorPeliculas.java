import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorPeliculas {
    private Map<String, List<Pelicula>> peliculasPorDirector;

    public GestorPeliculas() {
        this.peliculasPorDirector = new HashMap<>();
    }

    public Map<String, List<Pelicula>> getPeliculasPorDirector() {
        return peliculasPorDirector;
    }
    
    // Agrega una película al sistema
    public void agregarPelicula(Pelicula pelicula){
        String director = pelicula.getDirector();
        if (peliculasPorDirector.containsKey(director)) {
            List<Pelicula> peliculasDirector = peliculasPorDirector.get(director);
            peliculasDirector.add(pelicula);
        }else{
            ArrayList<Pelicula> peliculasDirector = new ArrayList<>();
            peliculasDirector.add(pelicula);
            peliculasPorDirector.put(director, peliculasDirector);
        }
    }
    
    // Retorna lista de películas que pertenecen al género especificado
    public List<Pelicula> buscarPorGenero(String genero){
        ArrayList<Pelicula> resultados = new ArrayList<>();
        for (List<Pelicula> listaPeliculas : peliculasPorDirector.values()) {
            for (Pelicula pelicula : listaPeliculas) {
                if (pelicula.tieneGenero(genero)) {
                    resultados.add(pelicula);
                }
            }    
        }
        return resultados;
    }

    // Retorna array de directores ordenado alfabéticamente
    public String[] obtenerDirectores(){
        String[] directores = new String[peliculasPorDirector.size()];
        int i = 0;
        for (String director : peliculasPorDirector.keySet()) {
            directores[i] = director;
            i++;
        }
        Arrays.sort(directores);
        return directores;
    }

    // Retorna el director con más películas registradas
        public String directorConMasPeliculas() {
        if (peliculasPorDirector.isEmpty()) {
            return null;
        }
        String directorMax = null;
        int maxPeliculas = 0;
        for (String director : peliculasPorDirector.keySet()) {
            int cantidad = peliculasPorDirector.get(director).size();
            if (cantidad > maxPeliculas) {
                maxPeliculas = cantidad;
                directorMax = director;
            }
        }
        return directorMax;
    }

    // BONUS: Retorna estadísticas de géneros
    public Map<String, Integer> obtenerEstadisticasGeneros() {
        Map<String, Integer> estadisticas = new HashMap<>();
        for (List<Pelicula> listaPeliculas : peliculasPorDirector.values()) {
            for (Pelicula pelicula : listaPeliculas) {
                for (String genero : pelicula.getGeneros()) {
                    if (estadisticas.containsKey(genero)) {
                        estadisticas.put(genero, estadisticas.get(genero) + 1);
                    } else {
                        estadisticas.put(genero, 1);
                    }
                }
            }
        }
        return estadisticas;
    }
}
