import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class testReadFile {
    public static void main(String[] args) throws FileNotFoundException {
       // String separator = File.separator;
       // String path = "D:"+separator+"Projects"+separator+"test3.txt";
        File file = new File("test3.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numb = line.split(" ");
        int [] numbers = new int[4];
        int count = 0;
        for(String number:numb){
            numbers[count++]=Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));
        scanner.close();
    }
}
