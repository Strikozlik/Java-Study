import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class SamostijnaPraktika {
    public static void main(String[] args) {
        int[] array = masive();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");

        }
        System.out.println();
        Arrays.sort(array);
        System.out.println("Відсортований масив" + Arrays.toString(array));
        System.out.println("Максимальне число масиву " + maxMasive(array));
        System.out.println("Мінімальне сичло масиву " + minMasive(array));
        System.out.println("Сума всіх чисел масиву " + getSumMasive(array));
        System.out.println("Середнє значення чисел масиву " + getSerMasive(array));
        System.out.println("Друге максимальне число масиву " + getSecondMax(array));
        System.out.println("Друге мінімальне ччисло масиву " + getSecondMin(array));


    }

    public static int[] masive() {
        Random rand = new Random();
        int x = rand.nextInt(50);
        int[] array = new int[x];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        return array;

    }

    public static int maxMasive(int[] masive) {
        int max = masive[0];
        for (int numb : masive) {
            max = Math.max(max, numb);
        }
        return max;
    }

    public static int minMasive(int[] masive) {
        int min = masive[0];
        for (int x : masive) {
            min = Math.min(min, x);
        }
        return min;
    }
    public static int getSumMasive(int [] masive){
        int sum =0;
        for(int x :masive){
            sum+=x;
        }return sum;
    }
    public static int getSerMasive(int [] masive){
        int ser = getSumMasive(masive)/masive.length;
        return ser;
    }
    public static int getSecondMax(int [] masive){
        int Max=Integer.MIN_VALUE;
        int secMax = masive[0];
        for(int i = 0;i<masive.length;i++){
            if (masive[i]>Max){
                int temp = Max;
                Max=masive[i];
                secMax=temp;
            }
            else if(masive[i] < Max && masive[i] > secMax) {
                secMax = masive[i];
            }
        }return secMax;
    }
    public static int getSecondMin(int [] masive) {
        int min = Integer.MAX_VALUE;
        int secMin = masive[0];
        for (int i = 0; i < masive.length; i++) {
            if (masive[i] < min) {
                int temp = min;
                min = masive[i];
                secMin = temp;
            }
        else if(masive[i] > min && masive[i] < secMin) {
                    secMin = masive[i];
                }
            } return secMin;
        }
        
}

