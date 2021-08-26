package day49_Exceptions;

import java.io.FileInputStream;

public class ExceptionIntro {
    public static void main(String[] args) throws InterruptedException {
        int[] arr={1,2,3};

      //  System.out.println(arr[100]);

      //  System.out.println(1000/0);
       // String str=null;
        //System.out.println(str.toUpperCase());

        System.out.println("hello");
        System.out.println("---------------------------------------------------");
try {


    Thread.sleep(3000);  // checked exception
    //  FileInputStream file=new FileInputStream("");
}catch (InterruptedException e){
    e.printStackTrace();
}
        System.out.println("Hello robinson");
    }
}
