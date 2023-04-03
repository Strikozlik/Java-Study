import java.util.ArrayList;
import java.util.stream.Collectors;

public class testArrayListToString {
    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            String res = "Hello";
            list.add(res);
        }
        System.out.println(list);
    }


}