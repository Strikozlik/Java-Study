import  java.util.Scanner;
public class Polimorf {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Ведіть число для перевірки на поліморфізм");
        int polymorf = x.nextInt();
        String rev = ""+polymorf;
        String reverce = new StringBuffer(rev).reverse().toString();
        System.out.println(reverce);
        if(rev.equals(reverce)){
            System.out.println("Число полиморф");
        }
        else System.out.println("Число не поліморф");

    }
}
