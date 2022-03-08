import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class test {


        public static void main(String[] args) {
            Calendar start = new GregorianCalendar(2014, Calendar.JANUARY, 2);
            Calendar end = new GregorianCalendar(2014, Calendar.FEBRUARY, 2);

            System.out.print("Старт");
            while (start.before(end)) {
                System.out.print(".");
                start.roll(Calendar.DAY_OF_MONTH, 1);

            }
            System.out.print("Фініш");
        }
    }
