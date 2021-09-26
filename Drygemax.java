import java.util.Scanner;
public class Drygemax {
    public static void main(String [] args){
        Scanner x = new Scanner(System.in);
        int max = x.nextInt();
        int max2 = x.nextInt();
        if(max2>max){
        int temp = max;
        max = max2;
        max2=temp;
        }
        while(x.hasNextInt()){
            int a = x.nextInt();
            if(a>max){
                max2=max;
                max=a;
            }else if(a<max && a>max2){
                max2=a;
            }
        } System.out.println(max2);
    }


}
