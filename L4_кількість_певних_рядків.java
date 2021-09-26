import java.util.Scanner;
public class L4_кількість_певних_рядків {
    public static void main(String [] args){
        Scanner x = new Scanner(System.in);
        String s = x.nextLine();
        int number = x.nextInt();
        do{
            System.out.println(s);
            number--;

        }while(number>0 && number<4);


    }
}

