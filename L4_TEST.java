import java.util.Scanner;
public class L4_TEST {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int num = 0;

        while (x.hasNextInt()) {
            int a = x.nextInt();
            if (a < 0){
                num++;}


        }System.out.println(num);
    }
}