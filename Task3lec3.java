import java.util.Scanner;
public class Task3lec3 {
    public static void main (String[] args) {
        Scanner c = new Scanner(System.in);
        int x = c.nextInt();
        int y = c.nextInt();
        if (x > 0 && y > 0)
            System.out.println("1");
         if (x < 0 && y > 0)
            System.out.println("2");
         if (x < 0 && y < 0)
            System.out.println("3");
       if (x > 0 && y < 0)
            System.out.println("4");


    }

}
