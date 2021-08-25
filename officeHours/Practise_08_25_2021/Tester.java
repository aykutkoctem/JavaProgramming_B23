package Practise_08_25_2021;

import java.time.LocalDate;

public class Tester extends Employee{

    public Tester(String name, char gender, LocalDate doB, int employeeID, String jobTitle, double salary) {
        super(name, gender, doB, employeeID, jobTitle, salary);
    }

    public void work(){
        System.out.println(getJobTitle()+" "+getName()+" is testing");
    }
    public void attendMeeting(){
        System.out.println(getJobTitle()+" "+getName()+" is attend scrum meeting");
    }

    @Override
    public void drink(String drink) {
        System.out.println(getJobTitle()+" "+getName()+" is drinking "+ drink);
    }
}
