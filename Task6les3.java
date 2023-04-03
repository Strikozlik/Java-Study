import java.util.Scanner;
public class Task6les3 {
    /*
Крізь терни…
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 5)
            System.out.println("число менше за 5");
        else if (number>5)
            System.out.println("число більше за 5");
        else
            System.out.println("число дорівнює 5");
       // String result = number < 5 ? "число менше за 5" : number > 5 ? "число більше за 5" : "число дорівнює 5";

    }
}


