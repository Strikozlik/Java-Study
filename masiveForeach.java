import java.util.Arrays;
import java.util.Scanner;
public class masiveForeach {
    public static void main(String[] args) {
        System.out.println("Введіть число,розмір масиву");
        Scanner x = new Scanner(System.in);
        int N = x.nextInt();
        int [] numbers =new int[N];
        System.out.println("Заповніть масив з " + N + "значень");
        for(int i = 0;i< numbers.length;i++){
            numbers[i] = x.nextInt();
        }
        for(int i : numbers){
            System.out.print(i + " ");
        }
        System.out.println();
        double sum = 0;
        double ser = 0;

        for(int i=0;i< numbers.length;i++){
            sum = sum + numbers[i];
            ser = sum/ numbers.length;
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(sum);
        System.out.println(ser);
    }
}
