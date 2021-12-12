import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ForEach {
    public static void main(String[] args) {
        ArrayList<String> namesArraylist = new ArrayList<String>();
        namesArraylist.add("Коля");
        namesArraylist.add("Петя");
        namesArraylist.add("Вася");
        namesArraylist.add("Маша");
        namesArraylist.add("Ира");
        namesArraylist.add("Вова");

        for (int i = 0; i < namesArraylist.size(); i++) {
            String s = namesArraylist.get(i);
            System.out.print(s + " ");
        }
        System.out.println();

        for (String s : namesArraylist) {
            System.out.print(s + " ");
        }
        System.out.println();

        HashSet<String> namesHashSet = new HashSet<String>();
        namesHashSet.add("Коля");
        namesHashSet.add("Петя");
        namesHashSet.add("Вася");
        namesHashSet.add("Маша");
        namesHashSet.add("Ира");
        namesHashSet.add("Вова");
        for (String s : namesHashSet) {
            System.out.print(s + " ");
        }
        System.out.println();

        Iterator iter = namesHashSet.iterator();
        while (iter.hasNext()){
            String  s = (String) iter.next();
            System.out.print(s+" ");
        }
    }
}

