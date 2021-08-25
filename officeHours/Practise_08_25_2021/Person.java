package Practise_08_25_2021;

import java.time.LocalDate;

public class Person {

    private String name;
    private final char gender;
    private final int age;
    private final LocalDate DoB;

    public Person(String name, char gender, int age, LocalDate doB) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        DoB = doB;
    }
}
