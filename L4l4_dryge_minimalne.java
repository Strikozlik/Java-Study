import java.util.Scanner;
public class L4l4_dryge_minimalne {
    public static void main(String [] args){
        Scanner x = new Scanner(System.in);


        int max = 0;
        while (x.hasNextInt()) {
            int a = x.nextInt();
            if (a > max) {
                max = a;
            }                                 //мінімільне робити з новою змінною і так само мінімальне 2


        }System.out.println( max );

    }
}



