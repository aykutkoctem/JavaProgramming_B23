package day58_Maps;

import java.util.*;

public class Example {
    public static void main(String[] args) {


        Map<String,String> scrum1=new LinkedHashMap<>();
        scrum1.put("Ivana","SM");
        scrum1.put("Katya","Developer");
        scrum1.put("Jenna","Developer");
        scrum1.put("Zaid","PO");
        scrum1.put("Nate","SM");
        scrum1.put("Zully","SDET");
        scrum1.put("Dilem","Teser");
        scrum1.put("Alex","Developer");
        scrum1.put("Ha","Tester");

        Map<String, String> scrum2 = new LinkedHashMap<>();
        scrum2.put("Yahya","SDET");
        scrum2.put("Ahmet","Developer");
        scrum2.put("Gulistan","Developer");
        scrum2.put("Ahmad","PO");
        scrum2.put("Aykut","SM");
        scrum2.put("Nazli","SDET");
        scrum2.put("Kadir","Teser");
        scrum2.put("Igor","Developer");
        scrum2.put("Saron","Tester");
        scrum2.put("Jonathan","BA");
        scrum2.put("Feruza","Tester");

        Map<String, String> scrum3 = new LinkedHashMap<>();
        scrum3.put("Yuliang", "BA");
        scrum3.put("Oleg", "Developer");
        scrum3.put("Ivan", "SM");
        scrum3.put("Andrei", "Developer");
        scrum3.put("Dontrell", "Developer");
        scrum3.put("Bakhtiyar", "Developer");
        scrum3.put("Farhad", "Tester");
        scrum3.put("Davut", "Tester");
        scrum3.put("Nasratullah", "Tester");
        scrum3.put("Oz", "PO");

        Map<String, String> scrum4 = new LinkedHashMap<>();
        scrum4.put("Matthew", "PO");
        scrum4.put("Komiljon", "SDET");
        scrum4.put("Alina","SDET");
        scrum4.put("Christina","Develepor");
        scrum4.put("Malika", "Developer");
        scrum4.put("Metin", "SM");
        scrum4.put("Altynai","Sdet");
        scrum4.put("Rabia","SDET");
        scrum4.put("Yelaman", "Developer");
        scrum4.put("Altan", "SM");

        Map<String, String> scrum5 = new LinkedHashMap<>();
        scrum5.put("Elza","SDET");
        scrum5.put("Mehmet","Developer");
        scrum5.put("Stefan","Developer");
        scrum5.put("Rishat","PO");
        scrum5.put("Ismail","SM");
        scrum5.put("Tamara","SDET");
        scrum5.put("Adnan","QA");
        scrum5.put("Ibrahim","Developer");
        scrum5.put("Mehmut","QA");

        List<Map<String,String>> employees=new LinkedList<>();
        employees.addAll(Arrays.asList(scrum1,scrum2,scrum3,scrum4,scrum5));

        for (Map<String, String> employee : employees) {
            for (Map.Entry<String, String> eachEntry : employee.entrySet()) {
                if (eachEntry.getValue().equals("Developer")){
                    System.out.println(eachEntry.getKey()+" : "+eachEntry.getValue());
                }
            }
        }
    }
}
