package day58_Maps;

import java.util.*;

public class frequencyOfCharacters {
    public static void main(String[] args) {


        String str="aaabbbbbbcccccdddddf";
        Map<String,Integer> frequencyOfChars=new LinkedHashMap<>();

        for (String each : str.split("")) {
            int f= Collections.frequency(Arrays.asList(str.split("")),each);
            frequencyOfChars.put(each,f);


        //    frequencyOfChars.put(each,)
        }
        System.out.println(frequencyOfChars);

        System.out.println("---------------------------------------");
        ArrayList<Integer> list=new ArrayList<>(frequencyOfChars.values());
        Collections.sort(list);
        int second=list.get(list.size()-2);
        System.out.println(second);
        System.out.println("------------------------------------------------");
        for (Map.Entry<String, Integer> entry : frequencyOfChars.entrySet()) {
            if (entry.getValue()==second){
                System.out.println(entry.getKey());
            }
        }
    }
}
//str:aaabbbbbbcccccddddd
//{a=3,b=3,c=4,d=5}