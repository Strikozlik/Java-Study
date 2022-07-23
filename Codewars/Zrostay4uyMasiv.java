package Codewars;

public class Zrostay4uyMasiv {
    public static boolean isAscOrder(int [] mas){
        for(int i =0;i<mas.length-1;i++){
            if(mas[i]+1 != mas[i+1])
                return false;

        }return true;
    }

    public static void main(String[] args) {
        int [] mas = new int[]{1,2,3,4,5,6,7};
        System.out.println(isAscOrder(mas));
    }
}
