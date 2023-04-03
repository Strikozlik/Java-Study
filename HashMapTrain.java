import java.util.HashMap;
public class HashMapTrain {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String,Integer>();
        map.put("Pavlo",35);
        map.put("Lesia",32);
        map.put("Roman",25);
        for(String key:map.keySet()){
            Integer value = map.get(key);
            System.out.println(key + "--->" + value);
        }
        for(var pair:map.entrySet()){
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + "--->" + value);
        }
        System.out.println(map.size());
        System.out.println(map.containsValue(32));
        System.out.println(map.get("Pavlo"));
        if(map.size() < 5){
            map.put("Zhyzha",2);
        }
        for(String key:map.keySet()){
            Integer value = map.get(key);
            System.out.println(key + "--->" + value);
        }
    }
}
