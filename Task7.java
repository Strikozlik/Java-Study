import java.util.Scanner ;
        /* Виклик до військомату*/

public class Task7 {
    public static void main(String [] args){
        String  militaryCommissar = ", з'явіться до військкомату";
        Scanner y = new Scanner(System.in);
        String name = y.nextLine();
        Scanner x = new Scanner(System.in);
        int Age = x.nextInt();
        if (18 <= Age)
            if(26 >= Age)
        System.out.println(name + militaryCommissar);
    }

}
