import java.util.Scanner;
public class Tasklec6 {
    public static void main(String [] args){
         String TRIANGLE_EXISTS = "трикутник існує";
         String TRIANGLE_NOT_EXISTS = "трикутник не існує";
        Scanner x =new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();
        if (a+b>c && b+c>a && a+c>b)
            System.out.println(TRIANGLE_EXISTS);
        else System.out.println(TRIANGLE_NOT_EXISTS);

    }

}
