package Practise_08_25_2021;

import java.time.LocalDate;

public class Cybertek {
    public static void main(String[] args) {
        Tester tester=new Tester("Aykut",'M', LocalDate.of(1994,2,23),0,"SDET",150000);
        tester.attendMeeting();
        tester.drink("coffee");
        tester.work();
    }
}
