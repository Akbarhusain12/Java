package Problem_solving;

import java.util.Scanner;

abstract class ATM{
    double balance;
    ATM(double balance){
        this.balance = balance;
    }
    abstract void withdraw(double balance);
    abstract void deposit(double balance);
    abstract void checkBal();  // This is the method that needs to be implemented
}

class ICICI extends ATM{
    ICICI(double balance){
        super(balance);
    }

    void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdraw Successfully");
        }
        else{
            System.out.println("Balance is Not Available");
        }
    }

    void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Amount is Deposited");
        }
        else {
            System.out.println("Invalid Amount");
        }
    }

    void checkBal(){  // Changed from chekbal() to checkBal()
        System.out.println("Available balance: " + balance);
    }
}

public class ATM_Abstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ICICI obj = new ICICI(1000);

        while (true){
            System.out.println("---ATM MENU ---");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Deposit Money");
            System.out.println("3. Check Money");
            System.out.println("4. Exit");
            System.out.println("---------");

            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double with_amt = sc.nextDouble();
                    obj.withdraw(with_amt);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depo_amt = sc.nextDouble();
                    obj.deposit(depo_amt);
                    break;
                case 3:
                    obj.checkBal();
                    break;
                case 4:
                    System.out.println("Thank you for using ICICI ATM");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Option, Please select correct option.");
            }
        }
    }
}
