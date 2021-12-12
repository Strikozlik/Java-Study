import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
public class ListArrayTest {

    public static void main(String[] args) {
        getTimeMsOfInsert(new ArrayList());
        getTimeMsOfInsert(new LinkedList());

    }
    public static long  getTimeMsOfInsert(List list){
        Date currenTime = new Date();
        insert1000000(list);
        Date newTime = new Date();
        long msDelay = newTime.getTime()- currenTime.getTime();
        System.out.println("Час роботи в мылысекундах = " + msDelay);
        return msDelay;
    }

    public static void  insert1000000(List list){
        for(int i=0;i<100000;i++){
            list.add(0,(i));
        }
    }
}
