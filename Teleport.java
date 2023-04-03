import java.util.Calendar;
import java.util.GregorianCalendar;

public class Teleport {
    public static final String INVENTED = "Будь ласка, можете забрати ваш кишеньковий телепорт. Дякуємо за очікування!";
        public static final String NOT_INVENTED = "Вибачте, телепорт іще не винайшли, приходьте через 10 років.";

        public static final Calendar INVENTION_DAY = new GregorianCalendar(2192, Calendar.JUNE, 12);

        public static void main(String[] args) {
            Calendar currentDay = Calendar.getInstance();
            while(!isTeleportInvented(currentDay)){

               currentDay.add(Calendar.YEAR,10);
            }
        }
    static boolean isTeleportInvented(Calendar currentDay) {
            if(currentDay.after(INVENTION_DAY)){
                System.out.println(INVENTED);
                return true;
            }else if(currentDay.before(INVENTION_DAY)){
                System.out.println(NOT_INVENTED);
            }
            return false;
        }
    }

