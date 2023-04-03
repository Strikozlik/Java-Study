import java.lang.reflect.Array;
import java.util.Arrays;

public class MasivePomn2 {
    public static void main(String[] args) {
        String s = "Hello Java and Pavlo";
        String x =reverseWords(s);
        System.out.println(x);

    }

    public static String reverseWords(final String original) {
        String[] str = original.split(" ");
        if(str.length == 0)
        return original;
        String [] strres = new String[str.length];


        for (int i = 0; i < str.length; i++) {
            StringBuilder builder = new StringBuilder(str[i]);
            builder.reverse();
            strres[i] = builder.toString();

        }return  String.join(" ",strres);
    }
}

//public class Kata
//{
//  public static String reverseWords(final String original)
//  {
//    String[] array = original.split(" ");
//
//    if(array.length == 0)
//        return original;
//
//
//    int i = 0;
//    for(String string : array){
//        array[i] = new StringBuilder(string).reverse().toString();
//        i++;
//    }
//
//    return String.join(" ",array);
//  }
//}