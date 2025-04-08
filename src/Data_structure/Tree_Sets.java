package Data_structure;

import java.util.TreeSet;

public class Tree_Sets {
    TreeSet<String> fruits = new TreeSet<>();

    public void addFruits() {
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");
    }

    public void displayFruits() {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public static void main(String[] args) {
        Tree_Sets ts = new Tree_Sets();
        ts.addFruits();
        ts.displayFruits();
    }
}
