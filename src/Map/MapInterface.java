package Map;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        Map<Integer, String> hm1 = new HashMap<>();
        Map<Integer, String> hm2 = new HashMap<Integer, String>();

        // Adding the Elements
        hm1.put(1, "By");
        hm1.put(2, "Order");
        hm1.put(3, "of");

        hm2.put(1, "fucking");
        hm2.put(2, "Peaky");
        hm2.put(3, "Blinders");


        //Updating the element
        // hm2.put(2,"The");

        System.out.println(hm1);
//        System.out.println("Initial map" + hm2);
        System.out.println(hm2);
    }
}

