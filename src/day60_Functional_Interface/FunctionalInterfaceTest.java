package day60_Functional_Interface;
import java.util.List;

public class FunctionalInterfaceTest {

    public static void main(String[] args) {
        // create a function that can merge two strings
        StringFunction mergeTwoStrings = (s1, s2) ->  s1+s2; ;

        String word1 = "Wooden";
        String word2 = "Spoon";

        String result1 =  mergeTwoStrings.function(word1, word2);

        System.out.println("result1 = " + result1);


        // create a function that can return the longest string between two strings
        StringFunction longestString = (f, s) -> {
            if(f.length() > s.length()){
                return f;
            }else{
                return s;
            }
        };

        String result2 = longestString.function("Cybertek", "Cydeo");
        System.out.println("result2 = " + result2);


        // create a function that can return the initials of a person.   ex: Wooden Spoon ==> W.S
        StringFunction initials = (f, l) ->   f.charAt(0) +"."+l.charAt(0);

        // longestString.function("Cybertek", "School");
        String result3 = initials.function("Cybertek", "School");
        System.out.println("result3 = " + result3);


        System.out.println("------------------------------------------------");


        DataFunction <String> reverseString=(s) -> new StringBuilder(s).reverse().toString();
        String r1=reverseString.accept("WoodenSpoon");
        System.out.println("r1 = " + r1);


        DataFunction<String> firstThreeChars=s -> s.substring(0,3);
       String r2= firstThreeChars.accept("Wooden Spoon");
        System.out.println("r2 = " + r2);

        DataFunction<Integer> cube=(n)->n*n*n;
        int r3=cube.accept(5);
        System.out.println("r3 = " + r3);
    }





}