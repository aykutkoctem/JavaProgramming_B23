package Practise_08_25_2021;

import java.time.LocalDate;

public class student extends Person{

    private int id;
    private String schoolName;

    public student(String name, char gender, LocalDate doB, int id, String schoolName) {
        super(name, gender, doB);
        setId(id);
        setSchoolName(schoolName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public void study(){
        System.out.println(getName()+" is studying");
    }
    public void atttendClass(){
        System.out.println(getName()+" is attending class");
    }

    @Override
    public String toString() {
        return "student{" +
                super.toString()+
                "id=" + id +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
