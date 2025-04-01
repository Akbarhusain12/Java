package Oops;

class Cust_Exception extends Exception {
    public Cust_Exception(String message) {
        super(message);
    }
}

public class Custom_exception {

    public static void checkNumber(int num) throws Cust_Exception {
        if (num <= 5) {
            throw new Cust_Exception("Number is not greater than 5!");
        } else {
            System.out.println("Number is valid: " + num);
        }
    }

    public static void main(String[] args) {
        try {
            checkNumber(3);
        } catch (Cust_Exception e) {
            System.out.println("Customer Error: " + e.getMessage());
        } finally {
            System.out.println("Custom Error is Created");
        }
    }
}
