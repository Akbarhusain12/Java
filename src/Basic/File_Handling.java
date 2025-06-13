package Basic;

import java.io.FileWriter;
import java.io.IOException;

public class File_Handling {
    public static void main(String[] args) {
        try{
            FileWriter write = new FileWriter("test.txt");
            write.write("Hii, This is new File \n New text added    " );
            System.out.println("File Written successfully");
            write.close();
        }
        catch (IOException e){
        System.out.println("Error" + e.getMessage());
        }
    }
}
