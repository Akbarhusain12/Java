package Oops;

public class Excep_handling {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 5;

            int div = a / b;
            System.out.println("Division is: " + div);
        } catch (ArithmeticException e) {
            throw new RuntimeException("An error occurred: Division by zero", e);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
