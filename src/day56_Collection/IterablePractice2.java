package day56_Collection;

import java.util.*;

public class IterablePractice2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Erjon", "Daniel", "Mustafa", "Mohammed","AHMED","ahmed"
        ));


       Iterator<String> it= names.iterator();

       while (it.hasNext()){
          String each= it.next();
           if (each.equalsIgnoreCase("ahmed")){
               it.remove();
           }

       }
        System.out.println(names);
        System.out.println("-------------------------------------------------------------------------");
        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Erjon", "Daniel", "Mustafa", "Mohammed","AHMED","ahmed"
        ));
        names2.removeIf(p->p.equalsIgnoreCase("ahmed"));
        System.out.println(names2);


        Set<Integer> set=new HashSet<>();
        set.addAll(Arrays.asList(10,9,11,1,2,3,4,5,6,7,12,13,14,15,16,17,25,20,18));

        for (Iterator<Integer> i=set.iterator(); i.hasNext();){
            if (i.next()<17){
                i.remove();
            }
        }
        System.out.println(set);

        System.out.println("-------------------------------------------------------------");

        Set<Integer> set2=new HashSet<>();
        set2.addAll(Arrays.asList(10,9,11,1,2,3,4,5,6,7,12,13,14,15,16,17,25,20,18));

        set2.removeIf(p->p<17);
        System.out.println(set2);

        for(int i =1, j =10, k = 100; i <= 10;  i++, j+= 10, k+= 100){
            System.out.println(i+" : "+j+" : "+k);
        }
    }
}
