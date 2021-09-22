import java.util.Scanner;
public class L4t2_while {

    /*
    Усі люблять Мамбу
    */
    public static void main(String[] args) {
        String text = " любить мене.";
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int x = 0;
        while (x < 10) {
            System.out.println(name+text);
            x++;
        }
    }
}

