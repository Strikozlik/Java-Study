package Codewars;

import java.util.Arrays;
import java.util.Locale;

public class isAnagram {
    public static boolean isAnagram(String test,String original){
        char [] test1 = test.toLowerCase().toCharArray();
        char [] original1 = original.toLowerCase().toCharArray();
        Arrays.sort(test1);
        Arrays.sort(original1);
        return Arrays.equals(test1,original1);
    }

    public static void main(String[] args) {
        String test = "foeFet";
        String test1 = "toffee";
        System.out.println(isAnagram(test,test1));
    }
}
