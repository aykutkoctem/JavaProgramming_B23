package day45_Inheritance.employeeTask;

public class AmazonInc { // AmazonInc Has A tester
                        // AmazonInc Has A Developer

    public static void main(String[] args) {

        Tester tester = new Tester("Robinson", 'M', 28, 11, "SDET", 120000);
        tester.eat("steak");
        tester.sleep();
        tester.testing();
     //   tester.code();
     //   tester.fixBugs();

        System.out.println("tester = " + tester);
        Developer developer = new Developer("Selda", 'F', 27, 12, "Java Developer", 130000);
        developer.eat("sushi");
        developer.sleep();
      //  developer.testing();
        developer.code();
        developer.fixBugs();

        Driver driver = new Driver("John", 'M', 79, 13, "Truck Driver", 85000);
        driver.eat("lobster");
        driver.sleep();
     //   driver.testing();
    //    driver.code();
     //   driver.fixBugs();


    }

}
