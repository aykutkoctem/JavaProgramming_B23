package day54_Recap;

import day41_CustomClass_Constructor.scrumTask.ScrumTeam;
import day45_Inheritance.employeeTask.Developer;
import day45_Inheritance.employeeTask.Employee;
import day45_Inheritance.employeeTask.Tester;
import day53_Abstraction.WebDriverTask.ChromeDriver;
import day53_Abstraction.WebDriverTask.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WarmUpTask {
    public static void main(String[] args) {

        Employee employee1 = new Developer("John", 'M', 32, 11, "QA", 110000);
        ((Developer) employee1).code();

        WebDriver driver = new ChromeDriver();
        //      ( (ChromeDriver)driver )
        //     (TakeScreenShot)driver

        Employee[] employees = {
                new Tester("John", 'M', 32, 11, "QA", 110000),
                new Developer("Selda", 'F', 27, 12, "Java Developer", 128000),
                new Tester("Robinson", 'M', 28, 10, "SDET", 120000),
                new Developer("Aysu", 'F', 23, 13, "Software Developer", 135000),
                new Tester("Jimmy", 'M', 30, 14, "SDET", 105000),
                new Developer("Gulistan", 'F', 26, 17, "Web Developer", 130000),
                new Tester("Breanna", 'F', 28, 15, "QE", 120000),
                new Developer("Ivana", 'F', 29, 18, "Front-end Developer", 140000),
                new Tester("Shay", 'F', 25, 16, "SDET", 130000),
                new Developer("Sophie", 'F', 26, 10, "Back-end Developer", 150000),
                new Tester("Aaron", 'M', 34, 19, "SDET", 115000),
                new Developer("Ibrahim", 'M', 26, 10, "Full Stack Developer", 142000),
                new Tester("Feruza", 'F', 24, 21, "QE", 125000)
        };


        // store all the developers & testers into the following List of employees
        //( (ArrayList)scrumMembers ) // down-casting: used for accessing the methods & variables of the object type
        List<Employee> scrumMembers =  new ArrayList<>(  Arrays.asList(employees) ); // upcasting
        System.out.println(scrumMembers);
        System.out.println(scrumMembers.size());

        System.out.println("---------------------------------------------------------------");

        // store all the testers into the following List of testers:
        List<Tester> testers = new ArrayList<>();

        // store all the developers into the following List of developers
        List<Developer> developers = new ArrayList<>();


        for (Employee employee : scrumMembers) {
            if(employee instanceof Tester){
                testers.add((Tester) employee);
            }

            if(employee instanceof Developer){
                developers.add( (Developer) employee);
            }

        }

        System.out.println("testers = " + testers);
        System.out.println("----------------------------------------------------");

        System.out.println("developers = " + developers);


        System.out.println("---------------------------------------------------");

        // which tester has the maximum salary?
        double maxSalaryOfTester = Double.MIN_VALUE;
        String nameOfTesterWithMaxSalary = "";

        // Which tester has the minimum salary
        double minSalaryOfTester = Double.MAX_VALUE;
        String nameOfTesterWithMinSalary = "";



        for (Tester tester : testers) {
            if(tester.salary > maxSalaryOfTester){
                maxSalaryOfTester = tester.salary;
                nameOfTesterWithMaxSalary = tester.name;
            }

            if(tester.salary < minSalaryOfTester ){
                minSalaryOfTester = tester.salary;
                nameOfTesterWithMinSalary = tester.name;
            }

        }

        System.out.println("maxSalaryOfTester = " + maxSalaryOfTester);
        System.out.println("nameOfTesterWithMaxSalary = " + nameOfTesterWithMaxSalary);

        System.out.println("minSalaryOfTester = " + minSalaryOfTester);
        System.out.println("nameOfTesterWithMinSalary = " + nameOfTesterWithMinSalary);

        System.out.println("----------------------------------------------------------------------");

        // which developer has the maximum salary?
        double maxSalaryOfDev = Double.MIN_VALUE;
        double minSalaryOfDev = Double.MAX_VALUE;

        String nameOfDevWithMaxSalary = "";  // max salary
        String nameOfDevWithMinSalary = ""; // min salary

        for (Developer developer : developers) {
            if(developer.salary > maxSalaryOfDev){
                maxSalaryOfDev = developer.salary;
                nameOfDevWithMaxSalary = developer.name;
            }

            if(developer.salary < minSalaryOfDev){
                minSalaryOfDev = developer.salary;
                nameOfDevWithMinSalary = developer.name;
            }

        }

        System.out.println("maxSalaryOfDev = " + maxSalaryOfDev);
        System.out.println("nameOfDevWithMaxSalary = " + nameOfDevWithMaxSalary);

        System.out.println("minSalaryOfDev = " + minSalaryOfDev);
        System.out.println("nameOfDevWithMinSalary = " + nameOfDevWithMinSalary);




    }
}