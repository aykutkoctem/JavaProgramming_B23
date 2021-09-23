package day45_Inheritance;

class A{
    public A(){
        System.out.println("A");
    }
}

class B extends A{

    public B(){
        //  super(); //A
        System.out.println("B");
        System.out.println("aykut");
    }

}

public class ConstructorCallsInInheritance {

    public static void main(String[] args) {
        new B();

    }

}
