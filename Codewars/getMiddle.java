package Codewars;

public class getMiddle {
    public static void main(String[] args) {
        String x = "Words";
        System.out.println(getMiddle(x));

    }
    public static String getMiddle(String word){
        int x = word.length();
        if(x%2 == 0 )
            return word.substring((x/2)-1, (x/2)+1);
        else return word.substring(x/2,(x/2)+1);
    }
}
