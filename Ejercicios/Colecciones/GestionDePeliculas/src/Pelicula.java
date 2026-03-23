import java.util.HashSet;
import java.util.Set;

public class Pelicula {
    private String titulo;
    private String director;
    private int duracion;
    private Set<String> generos;
    public Pelicula(String titulo, String director, int duracion, Set<String> generos) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.generos = new HashSet<>();
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public Set<String> getGeneros() {
        return generos;
    }

    public void agregarGenero(String genero) {
        if (genero != null && !genero.trim().isEmpty()) {
            this.generos.add(genero);
        }else {
            System.out.println("El género no puede ser nulo o vacío.");
        }
    }

    public boolean tieneGenero(String genero) {

        for (String string : generos) {
            if (string.equalsIgnoreCase(genero)) {
                return true;
            }
            
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pelicula [titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + ", generos="
                + generos + "]";
    }

}
