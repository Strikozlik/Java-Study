public class YearToSencury {


        public static int century(int number) {
            int cent=number/100;
            return number%100 ==0 ? cent:cent+1;
        }

    public static void main(String[] args) {
        System.out.println(century(1700));
    }
    }

