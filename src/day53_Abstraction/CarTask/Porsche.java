package day53_Abstraction.CarTask;

public class Porsche extends Car implements AutoPark{
    public Porsche(String model, String color, int year, double price) {
        super("Porsche", model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println("Auto-parking Porsche "+getModel());
    }

    @Override
    public void start() {
        System.out.println("Starting Porsche "+getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving Porsche "+getModel());
    }
}
