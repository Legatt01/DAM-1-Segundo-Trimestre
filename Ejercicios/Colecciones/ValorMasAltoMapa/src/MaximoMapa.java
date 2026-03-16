import java.util.*;

public class MaximoMapa {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       HashMap<String, Double> productos = pedirMapa(sc);
       
       mostrarMasCaro(productos);
       sc.close();
    }

    public static void mostrarMasCaro(HashMap<String, Double> mapa){
        double precioMasAlto = 0;
        String productoMasAlto = "";
        for (Map.Entry<String, Double> producto : mapa.entrySet()) {
            if(producto.getValue() > precioMasAlto) {
                precioMasAlto = producto.getValue();
                productoMasAlto = producto.getKey();
            }
        }
        System.out.printf("El procucto %s es el del precio más alto, a %.2f euros.",
            productoMasAlto, precioMasAlto
        );
    }

    public static HashMap<String, Double> pedirMapa(Scanner sc) {
        HashMap<String, Double> mapa = new HashMap<>();

        System.out.print("Dime cúantos productos me vas a dar: ");
        int num = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < num; i++) {
            System.out.print("Dime el producto " + (i+1) + ": "); 
            String producto = sc.nextLine();
            System.out.print("Dime el precio: ");
            double precio = Double.parseDouble(sc.nextLine());
            mapa.put(producto, precio);
        }

        return mapa;
    }    
}
