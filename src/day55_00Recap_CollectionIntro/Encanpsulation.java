package day55_00Recap_CollectionIntro;

import java.time.LocalDate;

public class Encanpsulation {

    private String bookName;
    private final LocalDate publishedDate=LocalDate.of(1998,5,2020);
    public String getBookName(){
        return bookName;
    }
    public String setBookName(String bookName){
        if (bookName.isEmpty()){
            throw new RuntimeException("Book name cannot be empty");
        }
        this.bookName=bookName;
        return bookName;
    }


    public final LocalDate getPublishedDate(){
        return publishedDate;
    }

    public final   static void main(String[] args) {

    }
}
class Test{
    public static void main(String[] args) {
        Encanpsulation obj=new Encanpsulation();
        obj.setBookName("asd");
        System.out.println(obj.getBookName());
    }
}