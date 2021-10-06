import java.util.Arrays;
import java.util.Scanner;

public class masiveMetods {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Введіть число розмір масиву");
        int N = x.nextInt();
        int[] numbers = new int[N];
        System.out.println("Тепер заповніть масив числами");
        for (int i = 0; i < N; i++) {
            numbers[i] = x.nextInt();
        }


        Arrays.sort(numbers);
        System.out.println("Ваш масив " + Arrays.toString(numbers));
        System.out.println("Відсортований масив " + Arrays.toString(numbers));
        System.out.println("Максимальне число масиву " + getMaxValue(numbers));
        System.out.println("Мінімальне число  масиву " + getMinValue(numbers));
        System.out.println("Сума всіх чисел масиву " + getSumValue(numbers));
        System.out.println("Cереднє значення всіх чисел масиву " + getSerValue(numbers));
        System.out.println("Cума максимального і мінімального " + getSumMaxPlusMin(numbers));
    }

    public static int getMaxValue(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int i : numbers) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int getMinValue(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int i : numbers) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static double getSumValue(int[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;

    }

    public static double getSerValue(int[] numbers) {

        double ser = 0.0;
        ser = getSumValue(numbers) / numbers.length;
        return ser;
    }

    public static int getSumMaxPlusMin(int[] numbers) {
        int summaxmin = getMaxValue(numbers) + getMinValue(numbers);
        return summaxmin;
    }


    }



