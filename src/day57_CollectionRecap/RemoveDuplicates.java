package day57_CollectionRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,7,7,7,5,5,5,6,6,6,10,10,8,8,9,9,9));

        // convert one collection type to another:
        list =   new ArrayList<>(new TreeSet<>(list)) ;

        System.out.println(list);

        System.out.println("-------------------------------------------------------");
        Integer[] nums = {1,1,1,2,2,2,3,3,3,4,4,7,7,7,5,5,5,6,6,6,10,10,8,8,9,9,9};

        // converting collectionType to Array data structure
        nums = new TreeSet<>(Arrays.asList(nums)).toArray(new Integer[0]);

        System.out.println(Arrays.toString(nums));

        System.out.println("------------------------------------------------------");
        String[] students = {"Feruza", "Sabir", "Mucahit", "Ismail"}; //"Esraa"

        ArrayList<String> l = new ArrayList<>(Arrays.asList(students));
        l.add("Esraa");
        l.add("Aysu");


        // convert Collection to array:
        students = l.toArray(new String[0]);

        System.out.println( Arrays.toString(students) );

        System.out.println("------------------------------------------------------");
        Integer[] n ={1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> l2 = new ArrayList<>( Arrays.asList(n));
        l2.removeIf(p -> p%2==0);

        n =l2.toArray(new Integer[0]);

        System.out.println(Arrays.toString(n));



    }


}