import java.util.ArrayList;
import java.util.Arrays;

public class Arraydif {
    public static int[] arrayDiff(int[] a, int[] b) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            lista.add(a[i]);
        }
        ArrayList<Integer> listb = new ArrayList<>();
        for(int i = 0;i<b.length;i++){
            listb.add(b[i]);
        }
        lista.removeAll(listb);
        return lista.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] c = {-12, -13, 14, 6, 5, -15, 3, -16, -1, -11, 8, 4, -4, -11, -6, -10, -2, -10, -12, -10};
        int[] d = {5, -11, -13, -16, 6, -9, 14, -6, -10, 3, -11, -15, -1, -10, -10, -2, -12};
        System.out.println(Arrays.toString(arrayDiff(c, d)));
    }
}

