import java.util.Arrays;
public class FakeBinarry {
    public static String fakeBin(String numberString){
        /*int [] mas = new int[numberString.length()];
        for(int i = 0;i<numberString.length();i++){
            String temp = String.valueOf(numberString.charAt(i));
            mas[i] = Integer.parseInt(temp);
        }
        System.out.println(Arrays.toString(mas));
        for (int i=0;i<mas.length;i++){
            if(mas[i]<5){
                mas[i] = 0;
            }
            if(mas[i]>=5){
                mas[i] = 1;
            }
        }
        String res = "";
        for(int i=0;i<mas.length;i++){
            res+=mas[i];
        }return res;*/
        return numberString.replaceAll("[1-4]","0").replaceAll("[^0]","1");
    }

    public static void main(String[] args) {
        String x = "721207742651982";
        System.out.println(fakeBin(x));
    }
}

