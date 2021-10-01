package day59_Maps;

public class CharSequences {
    public static void main(String[] args) {
        String str1="Cybertek";
        String str2=new String("Cybertek");

        String string="Wooden spoon";
        string.concat("is the best");
        System.out.println(string);
        System.out.println("-------------------------------------------");
        StringBuilder stringBuilder= new StringBuilder("Wooden spoon");
        stringBuilder.append(" is the best");
        System.out.println(stringBuilder);

        

    }
}
