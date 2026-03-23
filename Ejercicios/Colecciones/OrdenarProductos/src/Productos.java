public class Productos implements Comparable<Productos> {

    String nombre;
    Double precio;
    String codigo;
    public Productos(String nombre, Double precio, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString(){
        return "Producto[nombre = " + nombre + " | codigo = " + codigo + " | precio = " + precio + "]";
    }
    @Override
    public int compareTo(Productos otro){
        return this.precio.compareTo(otro.precio);
    }
}
