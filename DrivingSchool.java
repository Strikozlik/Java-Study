public class DrivingSchool {
    private static int sum;

    public static int cost(int mins){
        if(mins<60){
            return 30;
        }
        double dop = (double) (mins-60)/30;
        int doplata =(int) Math.ceil(dop);
        System.out.println(doplata);
        System.out.println(mins%30);
        if(mins%30<=5 && mins%30!=0){
            doplata=doplata-1;

        }
        System.out.println(doplata);

        return sum = 30+(doplata)*10;

    }

    public static void main(String[] args) {

        System.out.println(cost(653130));
    }
}
