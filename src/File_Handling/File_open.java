package File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_open {
    public static void main(String[] args) {
        try{
            BufferedReader read_java = new BufferedReader(new FileReader("Java.txt"));
            String temp;
            while ((temp = read_java.readLine()) != null){
                System.out.println(temp);
            }
            read_java.close();
        } catch (IOException e) {
            System.out.println("File cannot be able to read");
            e.printStackTrace();
        }
    }
}
