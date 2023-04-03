import java.util.ArrayList;

public class RozkladChusla {
    public static String  rozklad(int num){
        ArrayList<Integer> list = new ArrayList<>();
      if(num>2){
            for(int i = 2;i<50;){
                if(num%i == 0){
                    list.add(i);
                }num = num/i;
                i++;
            }
      }for(int i :list){
            System.out.print(i + ",");

        }      return null;
    }

    public static void main(String[] args) {
        System.out.println(rozklad(86240));
    }
}
