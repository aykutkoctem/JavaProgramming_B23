package day53_Abstraction.CarTask;

public class Audi extends Car implements AutoPark{
    public Audi( String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Starting Audi "+getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving Audi "+getModel());
    }

    @Override
    public void autoPark() {
        System.out.println("Auto-parking Audi "+getModel());
    }
}
