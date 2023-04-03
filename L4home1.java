import java.util.Scanner;
public class L4home1 {
    public static void main(String [] args){
        int sum = 0;
        Scanner x = new Scanner(System.in);
        while (x.hasNextInt()){
            int a = x.nextInt();
            sum = sum+a;

        }

        System.out.println(sum);

    }
}
