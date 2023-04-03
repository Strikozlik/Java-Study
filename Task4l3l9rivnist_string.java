import java.util.Scanner;
public class Task4l3l9rivnist_string {

    public static String secret = "AmIGo";

        public static void main(String[] args) {
            Scanner l = new Scanner(System.in);
            String code = l.nextLine();
            if(secret.equalsIgnoreCase(code))
                System.out.println("доступ дозволено");
            else
            System.out.println("доступ заборонено");
        }
    }


