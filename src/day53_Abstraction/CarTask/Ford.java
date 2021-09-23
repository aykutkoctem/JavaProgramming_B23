package day53_Abstraction.CarTask;

public class Ford extends Car{
    public Ford( String model, String color, int year, double price) {
        super("Ford", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Starting Ford "+getModel());
    }

    @Override
    public void drive() {

        System.out.println("Driving Ford "+getModel());
    }
}
