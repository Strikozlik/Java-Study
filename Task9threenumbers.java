import java.util.Scanner;
public class Task9threenumbers {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();

        if (a==b) if (a == c)
            System.out.println(a + " " + b + " " + c);
        if(a==b) if(b!=c)
            System.out.println(a + " " + b);
        if (b==c) if(a!=c)
            System.out.println(b + " " + c);
        if(a==c) if(a!=b)
            System.out.println(a + " " + c);

        }
    }
