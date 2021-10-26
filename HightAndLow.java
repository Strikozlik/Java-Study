import java.util.Arrays;

public class HightAndLow {
    public static void main(String[] args) {
        String s = "1 -6 3 4 5";
        System.out.println(highAndLow(s));
    }


    public static String highAndLow(String numbers) {
        String [] num = numbers.split(" ");
        int [] array = new int[num.length];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String result = "";
        String res = "";


        for(int i =0;i<array.length;i++){
            array[i] = Integer.parseInt(num[i]);

            if(array[i]>max){
                max = array[i];
            }
            if(array[i]<min){
                min = array[i];
            }
            StringBuilder builder = new StringBuilder(result);
            builder.append(max);
            builder.append( " " + min);
            res = builder.toString();
        }return res;
    }
}

//public class Kata {
//  public static String HighAndLow(String numbers) {
//     int max = Integer.MIN_VALUE;
//     int min = Integer.MAX_VALUE;
//     String nums[] = numbers.split(" ");
//
//     for(String s: nums) {
//       int num = Integer.parseInt(s);
//
//       max = Math.max(max, num);
//       min = Math.min(min, num);
//     }
//
//     return "" + max + " " + min;
//  }
//}

