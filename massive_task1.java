import java.util.Scanner;
/* Вводиться число з клавіатури,створюється олномірний масив і заповнюється числами введеними  з консолі*/
public class massive_task1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int N = x.nextInt();
        if (N > 0) {
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = x.nextInt();
            }
            if (N % 2 == 0)
                for (int i = N - 1; i >= 0; i--) {
                    System.out.println(array[i]);
                }
            if (N % 2 != 0)
                for (int i = 0; i < N; i++) {
                    System.out.println(array[i]);

                }
        }
    }
}


