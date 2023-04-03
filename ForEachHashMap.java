import java.util.HashMap;
import java.util.Map;

public class ForEachHashMap {
    public static void main(String[] args) {


        HashMap<String, String> namesHashMap = new HashMap<String, String>();
        namesHashMap.put("Николаев", "Коля");
        namesHashMap.put("Петров", "Петя");
        namesHashMap.put("Васильев", "Вася");
        namesHashMap.put("Машкина", "Маша");

        for(String s: namesHashMap.keySet()){
            System.out.print(s + " ");
        }
        System.out.println();

        for (String s : namesHashMap.values()){
            System.out.print(s+ " ");
        }
        System.out.println();

        for(Map.Entry<String, String> s : namesHashMap.entrySet()){
            System.out.print(s+ " ");
        }


    }
}