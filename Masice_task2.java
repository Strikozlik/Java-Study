import java.util.Scanner;
public class Masice_task2 {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведіть число яке буде розміром масиву");
        int n = Integer.parseInt(scanner.nextLine());

        array = new int[n];
        System.out.println("Введіть числа якими заповниться масив");
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            int number = array[i];
            if (number < min) {
                min = number;
            }
        }

        System.out.println("Мінімальне число " + min);
    }
}


