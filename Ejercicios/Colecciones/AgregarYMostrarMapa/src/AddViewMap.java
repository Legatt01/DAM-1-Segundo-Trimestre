import java.util.HashMap;
import java.util.Map;

public class AddViewMap {
    public static void main(String[] args) throws Exception {
        HashMap<String, Integer> Mimapa = new HashMap<>();
        Mimapa.put("María", 33);
        Mimapa.put("Juan", 22);
        Mimapa.put("Adrian", 67);
        Mimapa.put("Candela", 11);
        Mimapa.put("Rodrigo", 29);

        for (Map.Entry<String, Integer> miMap : Mimapa.entrySet()) {
            System.out.println(miMap.getKey() + " tiene " + miMap.getValue() + " años");
        }
    }
}
