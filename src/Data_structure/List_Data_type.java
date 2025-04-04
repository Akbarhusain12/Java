package Data_structure;

import java.util.ArrayList;
import java.util.List;

public class List_Data_type {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        System.out.println("Before Adding element- " + fruits);
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grape");
        fruits.add("Pineapple");
        fruits.add("Strawberry");
        fruits.add("Watermelon");
        fruits.add("Peach");
        fruits.add("Kiwi");
        System.out.println("After Adding element- " + fruits);
        System.out.println("Removed element - "+fruits.remove(3));
        System.out.println("After Removing element- " + fruits);

        System.out.println("Element using index - "+ fruits.get(4));
    }
}
