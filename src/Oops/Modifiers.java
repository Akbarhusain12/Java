package Oops;

class example{
    public int a = 10;
    protected int b = 20;
}



public class Modifiers {
    public int a = 10;
    protected int b = 20;
    int c = 30;
    private int d = 40;
    public static void main(String[] args) {
        Modifiers obj = new Modifiers();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
        System.out.println("\n");


        example ex = new example();
        System.out.println(ex.a);
        System.out.println(ex.b);
    }



}
