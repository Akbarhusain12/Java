package Oops;

public class Excep_handling {
    public static void main(String[] args) {
        try {
            // ArithmeticException (division by zero)
            int div = 10 / 0;
            System.out.println("Result: " + div);

            // ArrayIndexOutOfBoundsException
            int[] numbers = {1, 2, 3, 4, 5, 6};
            System.out.println("My Number: " + numbers[10]);

            // StringIndexOutOfBoundsException
            String Name = "Akbar";
            System.out.println("My Character at - " + Name.charAt(20));

            // NullPointerException
            String a = null;
            System.out.println(a.length());

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: String index is out of bounds.");
        } catch (NullPointerException e) {
            System.out.println("Error: Null reference encountered.");
        } catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
