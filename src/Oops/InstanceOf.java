package Oops;

class bird { }

class parrot extends bird { }

public class InstanceOf {
    public static void main(String[] args) {
        parrot myparrot = new parrot();

        // Checking instance
        System.out.println(myparrot instanceof parrot);    // true
        System.out.println(myparrot instanceof bird); // true
        System.out.println(myparrot instanceof Object); // true
    }
}

