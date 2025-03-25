package Oops;

public class Excep_handling {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 5;

            int div = a / b;
            System.out.println("Division is: " + div);

            int[] numbers = {10, 20, 30, 40, 50};

            System.out.println("Array elements:");
            for (int num : numbers) {
                System.out.println(num);
            }

        } catch (ArithmeticException e) {
            throw new RuntimeException("An error occurred: Division by zero", e);
        }catch(ArrayIndexOutOfBoundsException A){
            System.out.println("Array index is out of bounds.");
        }
        finally {
            System.out.println("Finally block executed.");
        }
    }
}
