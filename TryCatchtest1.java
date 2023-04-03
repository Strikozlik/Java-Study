import java.util.Scanner;

public class TryCatchtest1 {
    public static void main(String[] args) {
        System.out.println("Type two numbers");
        int a = 4;
        int b = 0;
        res(a,b);
        System.out.println("Succses finish");
        }
        public static void  res(int i,int j) {
        int c = 0;
        try {
             c = i/j;
            System.out.println(c);
        }catch (ArithmeticException e ){
           e.printStackTrace();
        }
    }
}
