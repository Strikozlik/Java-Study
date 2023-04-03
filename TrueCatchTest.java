import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class TrueCatchTest {
    public static final String PROMT_STRING = "Введіть номер мешканця або exit для виходу";
    public static final String EXIT = "exit";
    public static final String WASH = "Посуду миє ";
    public static final String NOT_EXIST = "Такого мешканця не існує";
    public static final String INT_NEED = "Введіть ціле число";

    static List<String> personsJournal = Arrays.asList(
            "Жужа",
            "Леся",
            "Рома",
            "Паша");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print(PROMT_STRING);
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase(EXIT)){
                break;
            }

            int persId;
            try {
                persId = Integer.parseInt(input);
            }catch (Exception e){
                System.out.println(INT_NEED);
                continue;
            }
            try{
                System.out.println(WASH + personsJournal.get(persId) );
            }catch (Exception e){
                System.out.println(NOT_EXIST);
            }
        }
    }
}
