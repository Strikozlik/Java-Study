import java.util.Scanner;
public class Task8temperatura {

/*
Виміряймо температуру тіла
Програма зчитує з клавіатури значення температури тіла й видає повідомлення про те,
 що температура тіла висока, низька або нормальна, залежно від умов.
У класі оголошено дві булеві змінні isHigh (висока температура) і isLow (низька),
 в які потрібно винести відповідні умови та замість виразів порівняння використовувати ці змінні.



*/

        private static boolean isHigh;
        private static boolean isLow;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double bodyTemperature = scanner.nextDouble();
            isHigh = bodyTemperature > 37;
            isLow = bodyTemperature < 36;
            //напишіть тут ваш код
            if (isHigh) {
                System.out.println("температура тіла висока");
            } else if (isLow){
                System.out.println("температура тіла низька");
            } else {
                System.out.println("температура тіла нормальна");
            }
        }
    }

