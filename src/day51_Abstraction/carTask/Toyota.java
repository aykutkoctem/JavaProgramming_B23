package day51_Abstraction.carTask;

public final class Toyota extends Car {


    public Toyota( String model, String color, int year, double price) {
        super("Toyota", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("-----------------------------");
        System.out.println("Insert the key");
        System.out.println("Twist the key to ignition");
        System.out.println("------------------------------");
    }

    @Override
    public void drive() {

    }
}
