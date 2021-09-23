package day53_Abstraction.CarTask;

public class CarShop {
    public static void main(String[] args) {



        Honda honda =new Honda("Civic","dark blue",2018,19500);
        honda.drive();
        honda.start();

        System.out.println("------------------------------------------------------");
        Ford ford =new Ford("Mustang","black",2019,25800);
        ford.drive();
        ford.start();

        System.out.println("---------------------------------------------------");
        Porsche porsche=new Porsche("Cayman","red",2017,68000);
        porsche.drive();
        porsche.start();
        porsche.autoPark();

        System.out.println("---------------------------------------------------");
        Audi audi =new Audi("A8","white",2020,83400);
        audi.drive();
        audi.start();
        audi.autoPark();

        System.out.println("---------------------------------------------------");
        Tesla tesla =new Tesla("S","blue",2021,120000);
        tesla.start();
        tesla.drive();
        tesla.selfDrive();
        tesla.autoPark();
        tesla.charging();

        System.out.println("-------------------------------------------------");
        Nio nio =new Nio("ET7","white",2020,68000);
        nio.start();
        nio.drive();
        nio.autoPark();
        nio.charging();
        nio.selfDrive();
    }
}
