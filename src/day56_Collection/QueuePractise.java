package day56_Collection;

import java.util.*;

public class QueuePractise {
    public static void main(String[] args) {
        Queue<Integer> q1=new PriorityQueue<>();
        q1.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));
        Queue<Integer> q2=new ArrayDeque<>();
        q2.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));
        Queue<Integer> q3=new LinkedList<>();
        q3.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println("q1 = " + q1);
        System.out.println("q2 = " + q2);
        System.out.println("q3 = " + q3);

        System.out.println(((LinkedList)q3).get(2));

        System.out.println("----------------------------------------");

        q1.poll();

        System.out.println("q1 = " + q1);

        q2.poll();
        System.out.println("q2 = " + q2);

        q3.poll();
        System.out.println("q3 = " + q3);
    }
}
