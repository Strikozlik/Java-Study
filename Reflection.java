import java.util.Arrays;

public class Reflection {
    public static void main(String[] args) {
        int [] p = {1000,15};
        int [] q = {-7,-214};
        System.out.println(Arrays.toString(pointReflection(p,q)));

    }
    public static int [] pointReflection(int [] p ,int [] q){
        int [] res = new int[p.length];
        for(int i =0;i<p.length;i++){
            res[i] = q[i] - (p[i] - q[i]);
        }return res;

    }
}
