/* виводить кількість рядків в яких введено лише числа*/
import java.util.Scanner;
public class L4_for_kilkistradkiv {
    public static void main(String [] args){
        Scanner console = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 10; i++)
        {
            if (console.hasNextInt())
                count++;
            console.nextLine();
        }
        System.out.println(count);
    }
}
