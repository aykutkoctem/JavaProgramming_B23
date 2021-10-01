package day49_Exceptions;

public class Practise {

    public static void main(String[] args) throws InterruptedException {


            Thread.sleep(3000);


        System.out.println("------------------------------------------");

        try {


            System.out.println(70 / 0);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("EXCEPTION IS OCCURED");
        throw new RuntimeException("EXCEPTION IS OCCURED");

    }
}
