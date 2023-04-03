import java.util.Scanner;
public class L4_швидкість_вітру {
    public static void main(String [] args){
        Scanner x = new Scanner(System.in);
        int s = x.nextInt();
        double S =s*3.6;

        System.out.println((int)Math.round(S));
    }
}
