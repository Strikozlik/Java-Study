import java.util.Scanner;
public class L4_площа_круга {
    public static void main(String [] args){
        Scanner x = new Scanner(System.in);
        double pi = 3.14;

        int radius = x.nextInt();
        if(radius>0){
            int S=(int)(pi*radius*radius);
            System.out.println(S);}
    }
}

