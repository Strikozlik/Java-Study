import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<5000000;i++){
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for(int i=0;i<100;i++){
            list.add(2000000,Integer.MAX_VALUE);
        }
        System.out.println("Час роботи в мілісукундах = " + (System.currentTimeMillis()-start));
    }
}
