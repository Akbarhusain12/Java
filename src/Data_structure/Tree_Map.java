package Data_structure;

import java.util.Map;
import java.util.TreeMap;

public class Tree_Map {
    public static void main(String[] args) {
        TreeMap<String, Integer> colors = new TreeMap<>();

        System.out.println("Empty -> " + colors);

        colors.put("Red", 1);
        colors.put("Green", 2);
        colors.put("Blue", 3);
        colors.put("Yellow", 4);


        System.out.println("After adding colors -> " + colors);


        System.out.println("Value associated with 'Green' -> " + colors.get("Green"));


        System.out.println("Does 'Blue' exist? -> " + colors.containsKey("Blue"));

        colors.remove("Red");
        System.out.println("After removing 'Red' -> " + colors);

        System.out.println("All entries:");
        for (Map.Entry<String, Integer> entry : colors.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("Size of the map -> " + colors.size());

        colors.clear();
        System.out.println("After clearing -> " + colors);
    }
}
