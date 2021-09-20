import java.util.Scanner;
    /*
Висока точність
*/

         public class Task7l3 {
             public static void main(String[] args) {
                 Scanner c = new Scanner(System.in);
                 double x = c.nextDouble();
                 double y = c.nextDouble();
            if (Math.abs(x-y) < 0.000001)
            System.out.println("числа рівні");
            else
            System.out.println("числа не рівні");
        }
    }


