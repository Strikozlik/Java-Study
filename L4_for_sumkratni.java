/*У методі main з клавіатури зчитується 3 цілих числа: start, end, multiple.
Допиши програму, щоб на екран виводилася сума чисел від start до end, кратних multiple.
Використай для цього цикл for.
Підказка: щоб перейти до наступної ітерації циклу, використовуй оператор continue.*/
import java.util.Scanner;
public class L4_for_sumkratni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;
        for (int i = start; i < end; i++) {
            if (i % multiple != 0) {
                continue;
            }
            sum = sum + i;
        }
        System.out.println(sum);
    }
}


