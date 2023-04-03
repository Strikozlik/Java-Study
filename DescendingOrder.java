import java.util.Arrays;
import java.util.regex.Pattern;
/* на вхыд число довыльне на вихыд выдсортоване по спаданню по цифрам*/
public class DescendingOrder {
    public static void main(String[] args) {
        int a = 895129296;

        System.out.println(sortDesc(a));
    }
    public static int sortDesc(final int num) {

        String str = Integer.toString(num);
      int [] result =new int[str.length()];
      for(int i=0;i<str.length();i++){
          String temp = String.valueOf(str.charAt(i));
          result [i] =Integer.parseInt(temp);
      }

        Arrays.sort(result);
        String res = "";
        for(int i = 0; i<result.length;i++){
            res += result[i];}

        StringBuilder builder = new StringBuilder();
            builder.append(res);
            String resultstr =builder.reverse().toString();
            return Integer.parseInt(resultstr);

        }
    }

