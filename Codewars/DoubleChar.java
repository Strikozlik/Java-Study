package Codewars;

import java.util.Locale;

public class DoubleChar {
    public static String doubleChar(String s){
        char [] mas = s.toCharArray();
        String res ="";
        for(char c:mas){
            res = res+c+c;
        }return res;
    }

    public static void main(String[] args) {
        String test = "Hello";
        System.out.println(doubleChar(test));
    }
}
