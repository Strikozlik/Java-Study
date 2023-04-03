import java.util.ArrayList;
import java.util.Collections;

public class RozkladNumb {
    public static String factors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 2;
        while (n >= 2) {
            if (n % i == 0) {
                list.add(i);
                n = n / i;
                continue;
            }i++;
        }
        String res = "";
        for(int k = 2; k <= Collections.max(list); k++){
            int x = Collections.frequency(list,k);
            if(x > 1){
                res+="(" + k + "**" + x + ")";
            } if(x == 1){
                res+="(" + k + ")";
            }
        } return res;

    }

    public static void main(String[] args) {
        System.out.println(factors(4166667));
    }
}
