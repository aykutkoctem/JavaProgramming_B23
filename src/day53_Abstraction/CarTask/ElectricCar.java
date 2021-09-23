package day53_Abstraction.CarTask;

class A{

    static int a;

    static{
        a=100;
    }

    int b;

    {
        b = 200;
    }


}

public interface  ElectricCar {

    //   public final static int a = 100;
    boolean hasBattery = true; // public static final by default

    public static void main(String[] args) {
        System.out.println(hasBattery);
    }


    void charging();


    /*
    what we cannnot have:
    static{
    }
    {
    }
    void method1(){
    }
    public ElectricCar(){
    }
    instance variable
     */

}
