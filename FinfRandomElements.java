import java.util.Random;
import java.util.Arrays;
public class FinfRandomElements {
    public static final int q = 7;

    public static void main(String[] args) {
        int[] array = masive();
        PrintMas(array);
        System.out.println();
        Arrays.sort(array);
        System.out.println("Відсортований масив" + Arrays.toString(array));
        System.out.println("Задане число зустрічається в масиві " + FindNumber(array) + " разів");
    }

    public static int[] masive() {
        Random rand = new Random();
        int x = rand.nextInt(250);
        int[] array = new int[x];
        for (int i = 0; i < x; i++) {
            array[i] = rand.nextInt(50);
        }
        return array;
    }

    public static void PrintMas(int[] masive) {
        for (int i = 0; i < masive.length; i++) {
            System.out.print(masive[i] + " ");
        }
    }

    public static int FindNumber(int[] masive) {
        int a = 0;
        for (int i =0;i<masive.length;i++) {
            if (masive[i] == q) {
                a = a+1;
            }
        }return a;
    }
}


