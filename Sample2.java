import java.util.Scanner ;
/* Зчитування з рядка*/
public class Sample2 {
    public static void main(String [] args){

        String str = "10 20 30 40";
        Scanner s = new Scanner(str);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println(a+b+c);

    }


}
