package Basic;

abstract class Vehicle{
    public abstract void Start();
    public abstract void Stop();

    void Welcome_msg(){
        System.out.println("Lets Build a Vehicle");
    }
}

class Bike extends Vehicle{
    private String FuelType;

    public void Start(){
        System.out.println("Bike is Starting......");
    }

    public void Stop(){
        System.out.println("Bike is Stopped");
    }

    public String getFuelType(){
        return FuelType;
    }

    public void setFuelType(String FuelType){
        this.FuelType = FuelType;
    }
}

public class ex_abstract {
    public static void main(String[] args) {
        Bike obj = new Bike();

        obj.Welcome_msg();
        obj.Start();
        obj.Stop();

        obj.setFuelType("Petrol");

        System.out.println("Your Vehicle Fuel Type - " + obj.getFuelType());
    }
}