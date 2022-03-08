import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DaysOfBirth {
    static Calendar birthday = new GregorianCalendar(1986, 9, 7);

    public static void main(String[] args) {
        Calendar curentDay = Calendar.getInstance();
        int count = 0;
        while(curentDay.after(birthday)){
            System.out.println("Ваш " + count + "-ий ень народження був в " +getDayOfbirth(birthday));
            birthday.add(Calendar.YEAR,1);
            count++;
        }
    }

    public static String getDayOfbirth(Calendar calendar) {
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        String res = "";
        switch (day) {
            case 1:
                res = "Неділя";
                break;
            case 2:
                res = "Понеділок";
                break;
            case 3:
                res = "Вівторок";
                break;
            case 4:
                res = "Середа";
                break;
            case 5:
                res = "Четвер";
                break;
            case 6:
                res = "П'ятниця";
                break;
            case 7:
                res = "Субота";

        }
        return res;

    }
}

