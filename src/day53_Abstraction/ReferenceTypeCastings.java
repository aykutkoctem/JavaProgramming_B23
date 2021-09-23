package day53_Abstraction;

import day45_Inheritance.animalTask.Animal;
import day45_Inheritance.animalTask.Cat;
import day45_Inheritance.animalTask.Dog;
import day45_Inheritance.employeeTask.Developer;
import day45_Inheritance.employeeTask.Employee;
import day45_Inheritance.employeeTask.Tester;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        Animal animal = new Dog("Lucy", "Husky", 'M', "Large", 10, "White"); // up casting
        animal.drink("Milk");
        animal.eat("Dog Food");
        animal.sleep();
        //  ( (Dog)animal ).bark();
        ((Dog) animal).bark();  // down casting

        //Dog dog = (Dog)animal;

        System.out.println("-----------------------------------------------------------");

        Employee employee = new Tester("Ahmet", 'M', 27, 11, "SDET", 100000);
        employee.eat("Food");
        employee.drink("Water");
        employee.sleep();
        employee.attendMeeting();
        employee.work();
        (  (Tester) employee ).testing();
        //    ( (Developer)employee ).fixBugs(); // Tester is Not a developer

        System.out.println("-----------------------------------------------------------");

        Animal animal2 = new Cat("Lucy", "Husky", 'M', "Large", 10, "White"); // up casting
        animal2.sleep();
        animal2.eat("Cat Food");
        animal2.drink("Milk");
        ((Cat) animal2).meow();
        //       ( (Dog)animal2 ).bark();  // Cat IS not A Dog








    }


}
