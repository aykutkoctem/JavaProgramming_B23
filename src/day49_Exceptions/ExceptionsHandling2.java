package day49_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsHandling2 {

    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("");

        }catch (FileNotFoundException e){
           e.printStackTrace(); //gives the full report of exceptions,
        }

        System.out.println("Test complated");
        System.out.println("--------------------------------------------------");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Test complated");

    }
}
