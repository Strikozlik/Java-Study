import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/* Виводить списо символів які використовуюютьс  в рядку*/
public class SpusokSymvoliv {
    public static void main(String[] args) {
        try(InputStream stream = System.in;
            Scanner scanner = new Scanner(stream))
        {
            String line = scanner.nextLine();
            char [] chars = line.toCharArray();
            Set<Character> characters =new HashSet<>();
            for(char achar:chars){
                if(Character.isAlphabetic(achar)){
                    characters.add(Character.toLowerCase(achar));
                }
            }
            System.out.print(characters);
        }catch (IOException e ){
            System.out.println("Somth wrong" + e);
        }

    }
}
