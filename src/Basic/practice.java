package Basic;

class myexception extends Exception{
    public myexception(String str){
        super(str);
    }
}

public class practice{
    public static void main(String[] args) {
        try{
            int age = 16;
            if(age < 18){
                throw new myexception("i want to print this block");
            }
            else{
                System.out.println("Valid Age");
            }
        }
        catch (myexception e){
            System.out.println("Error - " + e.getMessage());
        }
    }
}