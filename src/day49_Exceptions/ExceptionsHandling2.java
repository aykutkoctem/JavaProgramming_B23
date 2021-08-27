package day49_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsHandling2 {

    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("");
        }catch (FileNotFoundException e){
            e.printStackTrace(); // gives the full report of the exceptions,
        }


        System.out.println("Test Completed");

        System.out.println("---------------------------------------------");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Test Completed");


        System.out.println("---------------------------------------------");

        try {
            System.out.println(100 / 0);
            System.out.println("try block");
        }catch (RuntimeException e){
            System.out.println("Catch block");
        }finally { // gets executed even if the exception is not handled
            System.out.println("Finally block");
        }


        System.out.println("Test Completed");

        System.out.println("------------------------------------");

        try {
            System.out.println("Cybertek".charAt(-1));
            System.out.println("Try block");
        }catch (RuntimeException e){
            System.out.println("Catch block");
            System.exit(0);
        }finally {
            System.out.println("Finally block");
        }





    }


}