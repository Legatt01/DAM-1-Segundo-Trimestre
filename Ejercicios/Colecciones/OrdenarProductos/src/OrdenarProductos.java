import java.util.TreeSet;

public class OrdenarProductos {
    public static void main(String[] args) throws Exception {
        Productos p1 = new Productos("Raton", 15.50, "3234324W");
        Productos p2 = new Productos("Teclado", 120.50, "6434921N");
        Productos p3 = new Productos("Cascos", 70.99, "7244224Z");

        TreeSet<Productos> tienda =  new TreeSet<>();
        tienda.add(p1);
        tienda.add(p2);
        tienda.add(p3);

        for (Productos productos : tienda) {
            System.out.println(productos);
        }
    }
}
