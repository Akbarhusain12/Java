package Problem_solving;

class custom_eligible extends Exception{
    public custom_eligible(String msg){
        super(msg);
    }
}

public class Voting_eligible {
    public static void main(String[] args) {
        try{
            is_eligible(100);
        } catch (custom_eligible e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
    public static void is_eligible(int num) throws custom_eligible {
        if (num < 18) {
            throw new custom_eligible("You are not eligible for voting");
        } else {
            System.out.println("You are eligible for voting");
        }
    }
}

