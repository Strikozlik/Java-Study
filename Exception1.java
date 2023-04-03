import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обробка помилки в мейн методі");
        }
    }
    public static void readFile() throws FileNotFoundException {
        File file = new File("aerg000");
        Scanner scanner = new Scanner(file);
    }
}
