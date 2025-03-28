package Problem_solving;

public class Flower_details_try_catch {
    public static void main(String[] args) {
        String[] flowers = {"Rose", "Lily", "Tulip", "Daisy", "Sunflower",
                "Orchid", "Jasmine", "Marigold", "Lavender", "Chrysanthemum"};

        try {
            System.out.println("Flower at index 15: " + flowers[15]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an invalid index in the array.");
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}
