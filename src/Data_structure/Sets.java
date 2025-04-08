package Data_structure;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<String> Car = new HashSet<>();
        System.out.println("Before Adding - " + Car);
        Car.add("BMW");
        Car.add("AUDI");
        Car.add("KIA");
        System.out.println("After Adding - " + Car);
        System.out.println("After Removing");
        Car.remove("KIA");
        System.out.println(Car);
    }
}
