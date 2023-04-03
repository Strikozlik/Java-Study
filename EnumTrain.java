import java.util.Arrays;

public class EnumTrain {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Month.getSummerMonth()));

    }
    public enum Month{
        JANUARY("Січень",31),
        FEBRUARY("Лютий",28),
        MARCH("Березень",31),
        APRIL("Квітень",30),
        MAY("Травень",31),
        JUNE("Червень",30),
        JULY("Липень",31),
        AUGUST("Серпень",30),
        SEPTEMBER("Вересень",30),
        OCTOBER("Жовтень",31),
        NOVEMBER("Листопад",30),
        DECEMBER("Грудень",31);

        private String name;
        private  int daysCount;

        Month(String name,int daysCount){
            this.name = name;
            this.daysCount = daysCount;
        }
        public static Month[] getwinterMonth(){
            return  new Month[]{DECEMBER,JANUARY,FEBRUARY};
        }
        public static Month[] getSummerMonth(){
            return new Month[]{JUNE,JULY,AUGUST};
        }
        public String getName(){
            return name;
        }
        public  void setName(String name){
            this.name = name;
        }
        public  int getDaysCount(){
            return  daysCount;
        }
        public void setDaysCount(int daysCount){
            this.daysCount = daysCount;
        }
        public  String toString(){
            return "Month{" + "name='" + name + '\'' + ",daysCount=" + daysCount +  '}';
        }
    }
}
