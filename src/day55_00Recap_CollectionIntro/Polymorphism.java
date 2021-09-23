package day55_00Recap_CollectionIntro;

import day37_CustomClass.Dog;
import day51_Abstraction.shapeTask.Circle;
import day51_Abstraction.shapeTask.Rectangle;
import day51_Abstraction.shapeTask.Shape;

public class Polymorphism {

    public static void main(String[] args) {

        Object obj =  (Object) new Dog();
        // obj.play();
        (  (Dog) obj ).play(); // down casting

        System.out.println( obj instanceof Dog);

        System.out.println("--------------------------------------");

        Shape obj2 =  new Circle(3);

        System.out.println( obj2.area() );
        System.out.println( ((Circle) obj2).getR() );

        System.out.println(obj2 instanceof Rectangle);


        // System.out.println( ((Rectangle)obj2).getW() );




    }

}