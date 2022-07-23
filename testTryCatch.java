import java.util.Scanner;

public class testTryCatch {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Введіть два числадля ділення першого на друге");
        int z = x.nextInt();
        int y = x.nextInt();
        try {
            int a = z/y;
            System.out.println(a);
        }catch (Exception e ){
            System.out.println("На ноль і цифри не ділимо");
        }
    }
}
