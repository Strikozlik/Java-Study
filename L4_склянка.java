import java.util.Scanner;
public class L4_склянка {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner x = new Scanner(System.in);
        boolean a = x.nextBoolean();
        if(a == true)
            System.out.println((int)Math.ceil(glass));
        if(a == false)
            System.out.println((int)Math.floor(glass));



    }
}