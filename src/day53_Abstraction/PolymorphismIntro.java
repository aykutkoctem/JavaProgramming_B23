package day53_Abstraction;

import day45_Inheritance.employeeTask.Developer;
import day45_Inheritance.employeeTask.Employee;
import day45_Inheritance.employeeTask.Person;
import day45_Inheritance.employeeTask.Tester;
import day51_Abstraction.shapeTask.Circle;
import day51_Abstraction.shapeTask.Rectangle;
import day51_Abstraction.shapeTask.Shape;
import day51_Abstraction.shapeTask.Square;
import day53_Abstraction.WebDriverTask.ChromeDriver;
import day53_Abstraction.WebDriverTask.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphismIntro {
    public static void main(String[] args) {
        Shape circle=new Circle(5);
        Shape square=new Square(10);
        Shape rectangle=new Rectangle(4,5);

        System.out.println("-----------------------------");
        Shape[] array={new Circle(5),new Square(10),new Rectangle(4,5)};


        System.out.println("----------------------------------");
        Employee employee1=new Tester(" ",' ',1,1,"",10);

        Boolean isDeveloper=employee1 instanceof Developer;
        Boolean isTester=employee1 instanceof Tester;
        Boolean isPerson=employee1 instanceof Person;


        System.out.println(isDeveloper);
        System.out.println(isTester);
        System.out.println(isPerson);


        System.out.println("-------------------------------------");

        ArrayList<Shape> shapes = new ArrayList<>(Arrays.asList(array));
        shapes.addAll(Arrays.asList(
                new Square(15),  new Square(15),  new Square(15),
                new Square(15),  new Square(15),  new Square(15),  new Square(15),
                new Circle(10), new Circle(10), new Circle(10), new Circle(10), new Circle(10), new Circle(10),
                new Rectangle(100, 200),  new Rectangle(100, 200),  new Rectangle(100, 200),  new Rectangle(100, 200),
                new Square(15)
        ));
        int numberOfSquares=0,
        numberOfRectangles=0,
                numberOfCircles=0;
        for (Shape each : shapes) {
            if (each instanceof Rectangle){
                numberOfRectangles++;
            }else if (each instanceof Square){
                numberOfSquares++;
            }else {
                numberOfCircles++;
            }
        }
        System.out.println("numberOfSquares = " + numberOfSquares);
        System.out.println("numberOfRectangles = " + numberOfRectangles);
        System.out.println("numberOfCircles = " + numberOfCircles);

        System.out.println("-------------------------------------------------------------------");

        WebDriver driver=new ChromeDriver();
        if (driver instanceof ChromeDriver){
            System.out.println("Maximize Window");
        }else {
            System.out.println("Minimize Window");
        }
    }
}
