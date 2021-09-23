package day_Collection;

import java.util.*;

public class SetPractise {
    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};

        Set<String> items1 =new HashSet<>(  );
        items1.addAll( Arrays.asList(arr) );
        items1.add( null );

        Set<String> items2 = new LinkedHashSet<>(  );
        items2.addAll( Arrays.asList(arr) );
        items2.add( null );

        Set<String> items3 = new TreeSet<>( Arrays.asList(arr) );
        items3.addAll( Arrays.asList(arr) );
        //   items3.add( null ); // tree set does not accept null


        System.out.println("items1 = " + items1);
        System.out.println("items2 = " + items2);
        System.out.println("items3 = " + items3);


        //  String str = null;
        // str.equals("Cybertek");

        System.out.println("----------------------------------------------------");
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,6,1,2,3,4,5,6,1,2,3,4,5));

        list = new ArrayList<>( new LinkedHashSet<Integer>(list) );

        System.out.println(list);

        System.out.println("-----------------------------------------------------");

        String str = "abcabcabcabc";
        //  str =  new LinkedHashSet<>( Arrays.asList( str.split("")) ) .toString().substring(1).replace(", ", "").replace("]", "");
        str =  new LinkedHashSet<>( Arrays.asList( str.split("")) ) .toString();

        System.out.println(str);


        System.out.println("--------------------------------------------");

        Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        // returns the fifth element after removing duplicates
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(nums));
        System.out.println(linkedHashSet);
        System.out.println( new ArrayList<>( linkedHashSet  ).get(4)   );

        System.out.println("---------------------------------------------");

        //"aaaaabbbcccc" ===> "a5b3c4"
        //                    "a b c"
        //                     5 3 4


        String s="aaabbcddddeeeee";
        String result="";
        for (String ch : new LinkedHashSet<>(Arrays.asList(s.split("")))) {
           result+= ch+Collections.frequency(Arrays.asList(s.split("")),ch);
        }
        System.out.println("result = " + result);


    }

}