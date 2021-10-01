package day58_Maps;

import java.util.HashMap;
import java.util.Map;

public class MainIntro {
    public static void main(String[] args) {

        Map<String, Integer> employeeMap=new HashMap<>();
        employeeMap.put("selda",10000);
        employeeMap.put("Dilem",10000);
        employeeMap.put("selda",11000);
        employeeMap.put("mucahit",10000);
        employeeMap.put("John",120000);

        System.out.println(employeeMap);
      int n1=  employeeMap.get("mucahit");
        System.out.println(n1);

        System.out.println("-----------------------------------------");
        System.out.println(employeeMap);
        employeeMap.remove("selda");
        System.out.println(employeeMap);


        System.out.println(employeeMap.containsKey("mucahit")); //true
        System.out.println(employeeMap.containsKey("aykut"));   //false
        System.out.println("-----------------------------------------");

        System.out.println(employeeMap.containsValue(10000));
        System.out.println("-----------------------------------------");

        System.out.println(employeeMap);
        employeeMap.replace("mucahit",120000);

        System.out.println(employeeMap);
        employeeMap.replace("mucahit",employeeMap.get("mucahit")+20000);
        employeeMap.replace("Dilem",employeeMap.get("Dilem")-5000);
        System.out.println(employeeMap);
        System.out.println("-------------------------------------------");
        for (String eachName : employeeMap.keySet()) {
            System.out.println(eachName+" : "+employeeMap.get(eachName));
        }

        System.out.println("-----------------------------------------");

        employeeMap.put("Abbos", 115000);
        employeeMap.put("Yuliang", 120000);
        employeeMap.put("Feruza", 125000);
        employeeMap.put("Ahmet", 129000);
        employeeMap.put("Ismail", 111000);
        employeeMap.put("Zorana", 125000);
        employeeMap.put("Mehmet", 130000);
        employeeMap.put("Yuliia", 127005);
        employeeMap.put("Yasin,", 130000);
        employeeMap.put("Meltem", 121000);
        employeeMap.put("Dilem", 150000);
        employeeMap.put("Davut", 123000);
        employeeMap.put("Ekaterina", 135000);
        employeeMap.put("Mehmut", 143000);
        employeeMap.put("Merve,", 122000);
        employeeMap.put("Tamara", 133000);

        for (String eachKey : employeeMap.keySet()) {
            System.out.println(eachKey+" : "+employeeMap.get(eachKey));
        }
        System.out.println("---------------------------------------------");


        for (Integer eachValue : employeeMap.values()) {
            System.out.println(eachValue);
        }
        System.out.println("--------------------------------------------");
        for (Map.Entry<String, Integer> eachEntry : employeeMap.entrySet()) {
          //  System.out.println(eachEntry);
            System.out.println(eachEntry.getKey() + " : " + eachEntry.getValue());
        }
        System.out.println("----------------------------------------------");
        System.out.println(employeeMap);
        System.out.println("----------------------------------------------");

        // find max salary print the name of the employee who have the max salary

        int max=Integer.MIN_VALUE;
        String name="";
        for (Map.Entry<String, Integer> entry : employeeMap.entrySet()) {
            String eachName=entry.getKey();
            int eachSalary=entry.getValue();
            if (eachSalary>max){
                max=eachSalary;
                name=eachName;
            }
        }

        System.out.println("max = " + max);
        System.out.println("name = " + name);

    }
}
