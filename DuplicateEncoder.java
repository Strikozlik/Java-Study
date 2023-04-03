import java.util.Arrays;
import java.util.Locale;

public class DuplicateEncoder {
    static String encode(String word) {
        word = word.toLowerCase();
        String res = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.indexOf(word.charAt(i)) == word.lastIndexOf(word.charAt(i)))
                res += "(";
            else res += ")";
        }return res;
    }
    public static void main(String[] args) {
        System.out.println(encode("din"));
    }

}
