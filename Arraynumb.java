import java.util.Arrays;

public class Arraynumb {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBy(1,10)));

    }

    public static int[]countBy(int x,int y){
        int [] res = new int [y];
        for(int i=1;i<=y;i++){
            res[i-1] = x*i;
        }return res;
    }
}
