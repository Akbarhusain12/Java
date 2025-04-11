package File_Handling;
import java.io.FileWriter;
import java.io.IOException;

public class File_handling {
    public static void main(String[] args) {
        try{
            FileWriter java = new FileWriter("Java.txt");
            java.write("Java is High level Language " + "And We can use java in Machine learning");
            java.close();
            System.out.println("Files is Created");
        } catch (IOException e) {
            System.out.println("File not Created");
            e.printStackTrace();
        }
    }
}
