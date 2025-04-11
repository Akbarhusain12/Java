package Problem_solving;

import java.io.FileWriter;

public class pthon_oops {
    public static void main(String[] args) {
        try{
            FileWriter pythonOops = new FileWriter("Python_oops.txt");

            String content = "Object-Oriented Programming (OOP) is a programming paradigm that organizes code around "
                    + "objects, which contain data (attributes) and methods to manipulate that data. "
                    + "It promotes modularity, reusability, and maintainability. "
                    + "Key principles of OOP include encapsulation, inheritance, polymorphism, and abstraction.";

            pythonOops.write(content);
            pythonOops.close();

            System.out.println("File created and content written successfully.");
        } catch (Exception e) {
            System.out.println("File not Created");
        }
    }
}
