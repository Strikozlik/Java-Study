import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/*
Фейсконтроль
*/

public class InputStream {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            List<String>lines = Files.readAllLines(Paths.get(scanner.nextLine()));
            lines.forEach(str-> {
                char [] chars = str.toCharArray();
                for (char character :chars){
                    if(character!=' ' && character!='.' && character!=','){
                        System.out.print(character);
                    }
                }
            });
        }catch (Exception e){
            System.out.println("Somth wrong " + e);
        }
    }
}