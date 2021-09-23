package day55_00Recap_CollectionIntro;

interface Z{

    void m2();



}

interface Q{
    void m3();
}

interface X extends Z, Q{

    void m();
    int a = 300;

}

abstract class Y{

    public Y(){

    }

    int c =200;
    static int d = 400;

    protected void method1(){

    }

    public static void method2(){

    }

    public abstract void method3();


}



public class Abstraction extends Y implements X {
    @Override
    public void m() {

    }

    @Override
    public void method3() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }
}