package day51_Abstraction.carTask;

public class BMW extends Car {


    public BMW( String model, String color, int year, double price) {
        super("BMW", model, color, year, price);
    }

    @Override
    public void start() {

        System.out.println("-------------------------------");
        System.out.println("Call mechanic");
        System.out.println("Oil change");
        System.out.println("Jump start");
        System.out.println("-------------------------------");
    }

    @Override
    public void drive() {

    }
}
