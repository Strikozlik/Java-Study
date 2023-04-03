import java.util.Scanner;
import java.lang.String;
public class Tablicja_mnogen9 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Введіть початок таблиці множення по  вертикалі");
        int a = x.nextInt();
        System.out.println("Введіть кінець таблиці множення по вертикалі");
        int b = x.nextInt();
        System.out.println("Введіть початок таблиці по горизонталі");
        int c = x.nextInt();
        System.out.println("Введіть кінець таблиці по горизонталі");
        int d = x.nextInt();
        System.out.printf("      ");             // робим відступ в верхньому лівому куті
        for (int i = c; i < d; i++) {
            System.out.printf("%6d",i);      // виводимо множники по горизонталі
        }
        System.out.println();              // переходим  на наступний рядок для заповнення таблиці по горизонталі
        for (int i = a; i < b; i++) {
            System.out.printf("%6d",i);      //виводимо множники по вертикалі
            for (int k = c; k < d; k++) {     // цикл для заповнення таблиці значеннями
                System.out.printf("%6d",k * i);   // формула для внесення в таблицю
            }
            System.out.println("");            // виводим на новий рядок кожен рядок циклу для заповненян таблиці
        }
    }
}






