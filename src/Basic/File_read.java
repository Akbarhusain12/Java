package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class File_read {
    public static void main(String[] args) {
        try{
            BufferedReader b = new BufferedReader( new FileReader("test.txt"));
            String line;
            while ((line = b.readLine()) != null){
                System.out.println(line);
            }
            b.close();
        }
        catch (IOException e){
            System.out.println("Error - "+ e.getMessage());
        }
    }
}
