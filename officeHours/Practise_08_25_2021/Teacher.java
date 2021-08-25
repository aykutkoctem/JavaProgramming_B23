package Practise_08_25_2021;

import java.time.LocalDate;

public final class Teacher extends Employee{
    public Teacher(String name, char gender, LocalDate doB, int employeeID, String jobTitle, double salary) {
        super(name, gender, doB, employeeID, jobTitle, salary);
    }



    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is teaching");
    }

    @Override
    public void attendMeeting() {
        System.out.println(getJobTitle()+" "+getName()+" is attending teacher's meeting ");    }

    @Override
    public void drink(String drink) {
        System.out.println(getJobTitle()+" "+getName()+" is drinking "+drink);
    }
}

