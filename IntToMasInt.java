import java.util.Arrays;

public class IntToMasInt {
    public static void main(String[] args) {

        int x = 1234;
        System.out.println(Arrays.toString(changer(x)));

    }public static int[] changer(int x){
        String  mas = Integer.toString(x);
        int [] masiv = new int[mas.length()];
        for(int i=0;i<mas.length();i++){
            String temp = String.valueOf(mas.charAt(i));
            masiv[i] = Integer.parseInt(temp);
        }return masiv;
    }

}
