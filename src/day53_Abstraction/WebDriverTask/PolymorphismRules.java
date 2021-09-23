package day53_Abstraction.WebDriverTask;

import day45_Inheritance.animalTask.Dog;
import day47_Recap.phoneTask.IPhone;
import day47_Recap.phoneTask.Phone;
import day47_Recap.phoneTask.Samsung;

public class PolymorphismRules {
    public static void main(String[] args) {

        Phone phone1=new IPhone("12","large","black",1000);
        phone1.call(123);
        phone1.text(123);


        Phone phone2=new Samsung("s16","medium","white",1000);


        System.out.println("----------------------------------");
        WebDriver driver=new ChromeDriver();

        driver.get("www.google.com");

        System.out.println("-----------------------------");
        Dog animal=new Dog("Lucky","Husky",'M',"large",10,"White");
        animal.drink("Milk");
        animal.eat("Dog Food");
        animal.sleep();

    }
}
