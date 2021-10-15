import java.util.Random;

public class RandomMasive {
    public static void main(String[] args) {

        int[] array = masive();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");

        }
        System.out.println();
        System.out.println("Максимальне число " + maxMasive(array));
        System.out.println("Мінімальне число " + minMasive(array));
        System.out.println("Сума всіх чисел масиву " + sumMasive(array));
        System.out.println("Середнє значеня масиву " + serValue(array));
    }

    public static int[] masive() {
        Random rand = new Random();
        int x = rand.nextInt(50);
        int[] array = new int[x];
        for (int i = 0; i < x; i++) {
            array[i] = rand.nextInt(100);
        }
        return array;
    }

    public static int maxMasive(int[] masive) {
        int max = masive[0];
        for (int numbers : masive) {
            max = Math.max(max, numbers);
        }
        return max;
    }

    public static int minMasive(int[] masive) {
        int min = masive[0];
        for (int numbers : masive) {
            min = Math.min(min, numbers);
        }
        return min;
    }

    public static int sumMasive(int[] masive) {
        int sum = 0;
        for (int numbers : masive) {
            sum += numbers;
        }
        return sum;
    }

    public static int serValue(int[] array) {
        int ser = sumMasive(array) / array.length;
        return ser;
    }
}

