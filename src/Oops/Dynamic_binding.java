package Oops;


class Animal{
    public void sound(){
        System.out.println("Animal Sound");
    }

}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("BOW BOW");
    }
}

class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Meow Meow");
    }
}


public class Dynamic_binding {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.sound();

        d = new Cat();
        d.sound();
    }
}
