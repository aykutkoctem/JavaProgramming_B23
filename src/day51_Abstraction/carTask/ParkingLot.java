package day51_Abstraction.carTask;

public class ParkingLot {
    public static void main(String[] args) {

     //   Car car=new Car("Car","car1","Red",2020,1000) ;

        Toyota toyota= new Toyota("Avalon","Gray",2018,25000);
        Audi audi = new Audi("A8","Black",2021,90000);
        Tesla tesla = new Tesla("Roadster","Red",2022,180000);
        BMW bmw = new BMW("750","Black",2020,70000);

        System.out.println(toyota);
        System.out.println(audi);
        System.out.println(tesla);
        System.out.println(bmw);
        toyota.start();
        audi.start();
        tesla.start();
        bmw.start();

        System.out.println("--------------------------------------");

        Car[] cars ={toyota, audi, bmw, tesla};
        // WebDriver driver = new Chrome();
    }
}
