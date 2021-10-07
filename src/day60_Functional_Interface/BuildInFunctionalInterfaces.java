package day60_Functional_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BuildInFunctionalInterfaces {

    public static void main(String[] args) {
        Predicate<Integer> isEven=p->p%2==0?true:false;
    boolean r1=isEven.test(101);
        System.out.println("r1 = " + r1);


   // DataFunction<String> reverseString=(s)->new StringBuilder(s).reverse().toString();
    //   Predicate<String>isPalindrome=p->reverseString.accept(p).equalsIgnoreCase(p);
      //  isPalindrome.test()

        Predicate<String> isPalindrome=p->{
            String reverse=new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);
        };
     boolean r2=   isPalindrome.test("Cydeo");
        System.out.println("r2 = " + r2);
        System.out.println("----------------------------------------------------------------------------------");
        //removeIf()

        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        /*
        Predicate<Integer> isOdd=p->{
            if (p%2!=0){
                return  true;
            }else {
                return false;
            }
        };

         */
        list.removeIf(p->p%2!=0);

       // list.removeIf()

        List<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Josh","Breanna","Shay","Racecar"));
        //names.removeIf(p->new StringBuilder(p).reverse().toString().equalsIgnoreCase(p));
        names.removeIf(isPalindrome);
        System.out.println("names = " + names);
        System.out.println("---------------------------------------");
        Consumer<String> printThreeTimes=s-> System.out.println(s+s+s);

        printThreeTimes.accept("Cydeo");
    }
}
