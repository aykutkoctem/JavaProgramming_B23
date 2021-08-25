package day37_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogPark {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Kangal";
        dog1.gender = "Female";
        dog1.breed = "Kangal";
        dog1.age = 5;
        dog1.size = "large";
        dog1.color = "yellowish brown";


        System.out.println( dog1.name );
        System.out.println(dog1.gender);
        System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.age);
        System.out.println(dog1.color);

        Dog dog2 = new Dog();
        dog2.setInfo("Bobby","Shepard", "Female", "Brown", "large", 3);

        Dog dog3 = new Dog();
        dog3.setInfo("ninja","Husky","Male","Blue","Medium", 6);

        dog1.bark();
        dog2.bark();
        dog3.bark();

        System.out.println("----------------------------------------------");
        dog2.eat("Pizza");
        dog3.drink("Milk");
        dog1.play();

        System.out.println("----------------------------------");
        dog2.getInfo();

        System.out.println("-------------------------------------");
        dog3.getInfo();

        System.out.println("--------------------------------------------");

        Dog[] dogs = {dog1, dog2, dog3};

        ArrayList<Dog> dogsList = new ArrayList<>();
        dogsList.addAll(Arrays.asList(dog1, dog2, dog3) );

        System.out.println(Arrays.asList(dogsList));




    }

}
