import java.util.Scanner;
public class MaxMasive123 {

    public static void main(String[] args) {

        int [] array = getmasive();
        System.out.println(maxMas(array));
        System.out.println(minMas(array));

    }
    public static int[] getmasive(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть число,розмір масиву");
        int N = scan.nextInt();
        int [] array = new int[N];
        for(int i = 0;i<N;i++){
            array[i] = scan.nextInt();
        }return  array;

    }
    public static int maxMas(int [] masive){
        int max = masive[0];
        for(int numbers : masive){
            max = Math.max(max,numbers);
        }return max;
    }
    public static int minMas(int [] masive){
        int min = masive[0];
        for (int numbers :masive){
            min = Math.min(min,numbers);
        }return min;
    }

}
