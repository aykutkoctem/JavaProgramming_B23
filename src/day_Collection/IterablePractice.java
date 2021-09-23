package day_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {
    public static void main(String[] args) {

        List<Integer> list1=new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i)<4){
                list1.remove(i);
            }
        }
        System.out.println(list1);

        System.out.println("----------------------------");
        List<Integer> list2=new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        Iterator<Integer> it =list2.iterator();
        while (it.hasNext()){
            if (it.next()<4){
                it.remove();
            }
        }
        System.out.println("list2 = " + list2);
        System.out.println("------------------------");
        List<Integer> list3=new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        list3.removeIf(p->p<4);
        System.out.println("list3 = " + list3);
    }


}
