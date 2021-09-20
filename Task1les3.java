import java.util.Scanner;

public class Task1les3 {
    public static void main(String [] args){
        Scanner x = new Scanner(System.in);
        int age = x.nextInt();
        if (age<20 || age>60)
        System.out.println("можна не працювати");
    }
}
