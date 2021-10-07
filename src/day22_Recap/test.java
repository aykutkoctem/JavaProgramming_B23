package day22_Recap;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int min = 6;

        int digit = 0;
        int special = 0;
        int upCount = 0;
        int loCount = 0;
        String password;
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter Your Password:");
        password = scan.nextLine();
        if (password.length() >= min) {
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isUpperCase(c)) {
                    upCount++;
                }
                if (Character.isLowerCase(c)) {
                    loCount++;
                }
                if (Character.isDigit(c)) {
                    digit++;
                }
                if (c >= 33 && c <= 46 || c == 64) {
                    special++;
                }
            }
            if (special >= 1 && loCount >= 1 && upCount >= 1 && digit >= 1) {
                System.out.println(" Password is good:");
            }else {
                System.out.println("go");
            }

        }
    }
}
/*
public static boolean PassWordvalidation(String password) {
String lowercase="(.*[a-z].*)";
String uppercase="(.*[A-Z].*)";
String numbers="(.*[0-9].*)";
String specialchars="(.*[ -/, :-@].*)";
boolean HasLower = password.matches(lowercase),
HasUppere = password.matches(uppercase),
HasDigits = password.matches(numbers),
HasSpecial = password.matches(specialchars),
Valid = false;
if(password.length() >= 6 && !password.contains(" "))
if( HasLower && HasUppere && HasDigits && HasSpecial)
Valid = true;
return Valid;
}
 */