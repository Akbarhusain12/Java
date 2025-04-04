package Data_structure;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println("Original list: " + cars);

        cars.addFirst("Tesla");
        System.out.println("After adding at beginning: " + cars);

        cars.addLast("Audi");
        System.out.println("After adding at end: " + cars);

        cars.add(2, "Honda");
        System.out.println("After adding at index 2: " + cars);

        String firstCar = cars.getFirst();
        String lastCar = cars.getLast();
        String specificCar = cars.get(3);
        System.out.println("First car: " + firstCar);
        System.out.println("Last car: " + lastCar);
        System.out.println("Car at index 3: " + specificCar);

        cars.removeFirst();
        cars.removeLast();
        cars.remove(2);
        System.out.println("After removals: " + cars);
    }
}
