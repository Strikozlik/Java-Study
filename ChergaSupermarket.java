import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;

public class ChergaSupermarket {
    public static int cherga(int [] customers, int n){
      /*  int [] cherga = new int [n];
        ArrayList <Integer>list = new ArrayList();
        for(int i =0;i<cherga.length;i++){
            list.add(cherga[i]);
        }
        for(int i=0;i< customers.length;i++){
         Collections.sort(list);
         int temp = list.get(0);
         temp+=customers[i];
         list.set(0,temp);
        }
        return Collections.max(list);*/
        int [] result = new int[n];
        for(int i=0;i<customers.length;i++){
            result[0]+=customers[i];
            Arrays.sort(result);
        }return result[n-1];
    }

    public static void main(String[] args) {
        int[]pok = new int []{5,3,4};
        int kasa =2;
        System.out.println(cherga(pok,kasa));
    }
}
