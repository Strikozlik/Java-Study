import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
/* Читання з файлу і вивід на екран через один рядок*/
public class ReadFileOut135 {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)){
            List<String> list = Files.readAllLines(Paths.get(scanner.nextLine()));
            for(int i = 0;i< list.size();i++){
                String res = list.get(i);
                char [] chars = res.toCharArray();
                for(int j = 0;j< chars.length;j++){
                    if(j%2 == 1){
                        System.out.print(String.valueOf(chars[j]).toUpperCase());
                    }
                    else{
                        System.out.print(String.valueOf(chars[j]).toLowerCase());
                    }
                }
                System.out.println();


            }
        }

    }
}
