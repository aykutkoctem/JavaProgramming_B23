package day50_Exceptions;

public class morningWorkOut {

    public static void main(String[] args) throws  InterruptedException{

        for (int i = 1; i <= 30 ; i++) {
            System.out.println("Push-up "+i);
            pause(2.5);

        }

        System.out.println("---------------------------------");

        for (int i = 1; i <=20; i++) {
            System.out.println("Pull-up "+i);
            pause(3.5);
        }

    }

    public static void pause(double seconds) {
        try {
            Thread.sleep((long)(seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //                 (long)     (2.5 * 1000)
        //                                2500.0
    }





    public static void method1(){
        // main( new String[]{"A"} );
    }




}

/*
MorningWorkOut:
			1. Do 30 push-ups
			            try pausing 2.5 seconds in each
			2. Do 20 Pull-ups
			        try pausing 3.5 seconds in each
 */