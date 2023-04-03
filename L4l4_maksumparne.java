import java.util.Scanner;
public class L4l4_maksumparne {
    public static void main(String [] args) {
        Scanner c = new Scanner(System.in);

        int max = Integer.MIN_VALUE;

        while (c.hasNextInt()) {
            int x = c.nextInt();
               if (x>max && x%2 == 0) {
                max = x;
                   if(!c.hasNextInt() && x%2!=0) {
                       System.out.println(Integer.MIN_VALUE);
                       continue;
                   }
               }
        }
        System.out.println(max);
    }
}
