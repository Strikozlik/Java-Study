import java.util.*;
import java.util.ArrayList;

public class FilterList {
    public static List<Object> filterList( List<Object> list) {
        List rezult = new ArrayList();
        for(int i = 0;i<list.size();i++){
            if(list.get(i) instanceof Number){
                rezult.add(list.get(i));

            }
        }return rezult;
    }

    public static void main(String[] args) {
       ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add("a");
        list.add("b");
        list.forEach(System.out::println);
        List rezult = filterList(list);
        rezult.forEach(System.out::println);
    }
}
