package Basic;
import java.util.*;

public class collections {
    public static void main(String[] args) {
//        List<String> fruits = new ArrayList<>();
//
//        fruits.add("Apple");
//        fruits.add("Mango");
//        fruits.add("Chiku");
//
//        System.out.println(fruits.remove("Mango"));
//        System.out.println(fruits);

//        Set<String> car = new HashSet<>();
//
//        car.add("BMW");
//        car.add("AUDI");
//        car.add("BYD");
//        car.add("BMW");
//
//        System.out.println(car);

        Map<String, Integer> country = new HashMap<>();

        country.put("Alice", 90);
        country.put("Bob", 89);
        country.put("Alice", 95);

        System.out.println(country);
    }
}
