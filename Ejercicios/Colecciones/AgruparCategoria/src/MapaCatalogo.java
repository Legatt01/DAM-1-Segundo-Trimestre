import java.util.*;

public class MapaCatalogo {
    public static HashMap<String, ArrayList<String>> catalogo;

    public static void main(String[] args) throws Exception {
        catalogo = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opc;

        inicializar_catalogo();
        do {
            opc = menu(sc);

            switch (opc) {
                case 1:
                    addCategoria(sc);
                    break;

                case 2:
                    addProducto(sc);
                    break;

                case 3:
                    showCatalogo(true);
                    break;
            }

        } while (opc != 0);

        sc.close();
    }

    public static void addCategoria(Scanner sc) {
        System.out.print("Dime la categoría a añadir: ");
        String cat = sc.nextLine();
        if (catalogo.containsKey(cat))
            System.out.println("Esa categoría ya existe.");
        else {
            catalogo.put(cat, new ArrayList<String>());
            System.out.println("Añadida correctamente.");
        }
    }

    public static void addProducto(Scanner sc) {
        showCatalogo(false);
        System.out.println();
        System.out.print("Dime el número de la categoría: ");
        int catNum = Integer.parseInt(sc.nextLine());

        System.out.print("Dime el producto a añadir: ");
        String prod = sc.nextLine();

        int i = 1;
        for (Map.Entry<String, ArrayList<String>> categoria : catalogo.entrySet()) {
            if(i == catNum){
                categoria.getValue().add(prod);
                System.out.println("Añadido correctamente.");
            }
            i++;
        }        
    }

    // le paso true para mostrar todo el catálogo o false para las categorías
    public static void showCatalogo(boolean completo) {
        System.out.println("\n--- Catálogo de la Tienda ---");
        int i = 1;
        for (Map.Entry<String, ArrayList<String>> categoria : catalogo.entrySet()) {
            System.out.println(i + ".- " + categoria.getKey());
            if (completo) {
                for (String producto : categoria.getValue()) {
                    System.out.println("\t" + producto);
                }
            }
            i++;
        }
        System.out.println();
    }

    public static void inicializar_catalogo() {
        ArrayList<String> prod1 = new ArrayList<>();
        ArrayList<String> prod2 = new ArrayList<>();
        prod1.add("Manzana");
        prod1.add("Naranja");
        catalogo.put("Frutas", prod1);
        prod2.add("Lechuga");
        catalogo.put("Verduras", prod2);
    }

    public static int menu(Scanner sc) {
        System.out.println("--- Gestión Tienda ---");
        System.out.println("1.- Añadir Categoría");
        System.out.println("2.- Añadir Producto");
        System.out.println("3.- Mostrar Catálogo");
        System.out.println("0.- Salir");
        System.out.print("\n\tSelecciona opción: ");

        return Integer.parseInt(sc.nextLine());
    }
}