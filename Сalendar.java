import java.util.Calendar;
import java.util.GregorianCalendar;

public class Сalendar {


        static Calendar birthDate = new GregorianCalendar(1986,9,12);

        public static void main(String[] args) {
            System.out.println(getDayOfWeek(birthDate));

        }

        static String getDayOfWeek(Calendar calendar) {
            int day = calendar.get(Calendar.DAY_OF_WEEK);
            System.out.println(day);
            String res = "";
            switch (day){
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


