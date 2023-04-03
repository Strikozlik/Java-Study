import java.util.Arrays;
import java.util.HashSet;

public class CountingDuplicates {
    public static void main(String[] args) {
        String s = "indivisibility";
        System.out.println(duplicateCount(s));

    }

    public static int duplicateCount(String text) {
        HashSet<Character> set = new HashSet<>();
        char[] chars = text.toLowerCase().toCharArray();

        for(int i = 0;i<chars.length;i++){
            for(int j = i+1;j<chars.length;j++){
                if(chars[i] == chars[j]){
                    set.add(Character.valueOf(chars[i]));
                }
            }
        }return set.size();
    }
        }






