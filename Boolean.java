import java.util.Scanner;
public class Boolean {
    public static void main(String []args){
        Scanner x = new Scanner(System.in);

        int age = x.nextInt();
        boolean young = (age<=18);
        boolean old = (age>=65);
        boolean good = (18< age && age<65);
        if (young)
        System.out.println("Live fluently my friend");
        if (old)
            System.out.println("Be happy");
        if (good)
            System.out.println("Work hard");
    }

}
