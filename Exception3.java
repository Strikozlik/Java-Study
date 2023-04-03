import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
        File file = new File("test3.txt");
        try {
            Scanner scanner = new Scanner(file);
            String x = scanner.nextLine();
            System.out.println(x);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        }

    }
}
