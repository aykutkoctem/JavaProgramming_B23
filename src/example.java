public class example {


    public static String removeDup(String str){
        String result="";

        for (int i=0; i<=str.length()-1; i++){
            if (!result.contains(""+str.charAt(i))){
                result+=""+str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(removeDup("AAAABBBCCCDDD"));
    }
}
