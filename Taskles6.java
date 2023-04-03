import java.util.Scanner;

public class Taskles6 {
/* Зчитування з рядка*/

    public static void main(String [] args){


        String str = "123456 321  321";
        Scanner s = new Scanner(str);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println(a+b+c);
    }
}

