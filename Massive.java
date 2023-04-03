import java.util.Arrays;
import java.util.Scanner;
public class Massive {
    public static int[] mas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Введіть число 2 або 3");
        int n = x.nextInt();
        int[][] masive = new int[n][];
        do {
            if (n == 2) {
                masive[0] = Arrays.copyOfRange(mas, 0, mas.length / 2);
                masive[1] = Arrays.copyOfRange(mas, mas.length / 2, mas.length);
                System.out.println(Arrays.deepToString(masive));
                break;
            }
            if (n == 3) {
                masive[0] = Arrays.copyOfRange(mas, 0, mas.length / 3);
                masive[1] = Arrays.copyOfRange(mas, mas.length / 3, mas.length * 2 / 3);
                masive[2] = Arrays.copyOfRange(mas, mas.length * 2 / 3, mas.length);
                System.out.println(Arrays.deepToString(masive));
                break;
            }
            else System.out.println("Введіть вірне число");
        }
            while (n == 2 || n == 3) ;



    }

}