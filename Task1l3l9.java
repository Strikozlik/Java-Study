import java.util.Scanner;
public class Task1l3l9 {
    public static void main(String [] args){
        Scanner c = new Scanner(System.in);
        String l1 = c.nextLine();
        String l2 = c.nextLine();
        /*if (l1.equals(l2))
            System.out.println("рядки однакові");
        else
            System.out.println("рядки різні");*/
        String res = l1.equals(l2) ? "рядки однакові":"рядки різні";
        System.out.println(res);


    }
}
