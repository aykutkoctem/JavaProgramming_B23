package Practise_08_25_2021;

import java.time.LocalDate;

public class Cybertek {
    public static void main(String[] args) {
        Tester tester=new Tester("Aykut",'M', LocalDate.of(1994,1,22),0,"SDET",150000);
        tester.attendMeeting();
        tester.drink("coffee");
        tester.work();
        tester.eat("Pizza");
        tester.sleep();
        System.out.println("tester = " + tester);

        System.out.println("----------------------------------------------------");
        Developer developer=new Developer("Anil",'F',LocalDate.of(1993,12,01),1,"Developer",120000);
        developer.attendMeeting();
        developer.drink("Coke");
        developer.work();
        developer.eat("Steak");
        developer.sleep();
        System.out.println("developer = " + developer);
    }
}
