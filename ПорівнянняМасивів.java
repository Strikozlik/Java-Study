import java.util.Arrays;

public class ПорівнянняМасивів {
    public static String isSortedAndHow(int[] array) {
        String s = Arrays.toString(array);
        System.out.println(s);
        Arrays.sort(array);
        String sort = Arrays.toString(array);
        System.out.println(sort);
        if (s.equals(sort))
            return "yes, ascending";
        reverseArray(array);
        String rev = Arrays.toString(array);
        System.out.println(rev);
        if (s.equals(rev))
            return "yes, descending";
        else return "no";
    }


    public static void main(String[] args) {
        int [] arr = {1,2};
        System.out.println(isSortedAndHow(arr));
    }
    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
}



