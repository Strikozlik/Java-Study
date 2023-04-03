import java.util.Scanner ;
/* ведення температури з клавіатури і виведення рекомендацій*/
public class Task6 {
    public static void main(String [] args){
        String cold = "на вулиці холодно";
        String warm = "на вулиці тепло";
        Scanner t = new Scanner(System.in);
        int x = t.nextInt();
        if(x>0)
            System.out.println(warm);
        else
            System.out.println(cold);

    }
}
