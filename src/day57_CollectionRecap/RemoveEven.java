package day57_CollectionRecap;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class RemoveEven {

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        set.addAll(Arrays.asList(10, 10, 10, 9, 11, 8, 12, 7, 14, 15, 6,5,4,3,2,1));

        System.out.println(set);

        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            if( it.next() %2 ==0){
                it.remove();
            }
        }

        System.out.println(set);

        System.out.println("---------------------------------------------------");
        Set<Integer> set2 = new TreeSet<>();
        set2.addAll(Arrays.asList(10, 10, 10, 9, 11, 8, 12, 7, 14, 15, 6,5,4,3,2,1));

        set2.removeIf( n -> n%2==0);

        System.out.println(set2);

    }


}

/*
2. write a program that can remove the even numbers from a Set of Integers
			DO NOT use Lambda expressions
 */