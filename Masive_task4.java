import java.util.Scanner;
public class Masive_task4 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int N = Integer.parseInt(x.nextLine());
        if (N > 0) {
            multiArray = new int[N][];
            for (int i = 0; i < N; i++) {
                int a = Integer.parseInt(x.nextLine());
                multiArray[i] = new int[a];


            }
        }
    }
}


