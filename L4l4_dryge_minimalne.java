import java.util.Scanner;
public class L4l4_dryge_minimalne {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int max = 0;
        int min = 200000001;
        int min2=200000000;
        while(x.hasNextInt()){
            int b = x.nextInt();
            if(b<min){
                min2=min;}
            if(b<min){
                min = b; }
            if(b<min2 && b>min ){
                min2=b;}



        }System.out.println(min2);




    }
}

