package day51_Abstraction;
class A{
    int a;
    static int b;

    public A(int a) {
        this.a = a;
    }

    static{
        b= 200;
    }

    public static void main(String[] args) {

    }

    public void method1(){

    }

    // public abstract void method2();


}

abstract class B{
    int a;
    static int b;

    public B(int a) {
        this.a = a;
    }

    static{
        b= 200;
    }

    public static void main(String[] args) {

    }

    public void method1(){

    }

    public abstract void method2();


}



public class RegularClass_VS_AbstractClass {

    public static void main(String[] args) {
        A obj = new A(10);
        //  B obj2 = new B(20);


    }


}



abstract class C{

    public abstract void method1();
    public abstract void method2();

}

// class D extends C{ }

abstract class E extends C{ }
