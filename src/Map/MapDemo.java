package Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> hsm = new HashMap<>();

        //hsm : value name.

        hsm.put(null, 100);
        hsm.put("Bimbo", 200);
        hsm.put("Cynthia", 300);
        hsm.put("Kloss", 400);

        for (Map.Entry<String, Integer> me : hsm.entrySet()) {

            // Printing keys
            System.out.print(me.getKey() + ":" );
            System.out.println(me.getValue());
        }
    }
}
