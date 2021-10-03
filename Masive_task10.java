import java.util.Arrays;

public class Masive_task10 {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] sort = Arrays.copyOf(array, array.length);
        Arrays.sort(sort);
        int number = Arrays.binarySearch(sort, element);
        if (number >= 0) {
            System.out.println(true);     //System.out.println(index >= 0);

        }
        if (number < 0) {
            System.out.println(false);
        }
    }
}

