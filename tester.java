import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class tester {
    public static void main(String[] args) {
        GregorianCalendar cannes = new GregorianCalendar(216, Calendar.AUGUST,2);
        cannes.set(Calendar.ERA,GregorianCalendar.BC);
        DateFormat df = new SimpleDateFormat("dd MMM yyy");
        System.out.println(df.format(cannes.getTime()));
    }

}
