import java.io.FileReader;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("reader.txt");
        Scanner sc = new Scanner(fr);
        int i=1;
        while (sc.hasNextLine()){
            System.out.println(i+ " " + sc.nextLine());
            i++;
        }fr.close();

    }
}
