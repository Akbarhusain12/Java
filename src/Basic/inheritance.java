package Basic;

class Vehicle1{
    void Start(){
        System.out.println("Starting....");
    }
}

class car extends Vehicle1{
    public void Drive(){
        System.out.println("Driving");
    }

    public car(){
        super();
        System.out.println("Car is Created");
    }
}
public class inheritance {
    public static void main(String[] args) {
        car c = new car();
        c.Start();
        c.Drive();

    }
}
