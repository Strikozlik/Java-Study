import java.util.ArrayList;
import java.util.Collections;

public class TrainCollection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        Collections.replaceAll(list, 2, 22);
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        Collections.sort(list);
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        Collections.reverse(list);
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        Collections.rotate(list, 5);
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        Collections.shuffle(list);
        for (int i : list) {
            System.out.print(i + " ");
        }
        int min = Collections.min(list);
        System.out.println(min);
        int max = Collections.max(list);
        System.out.println(max);
        int num = Collections.frequency(list, 5);
        System.out.println(num);
        Collections.sort(list);
        int index = Collections.binarySearch(list, 7);
        System.out.println(index);
        Collections.fill(list, 7);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}

