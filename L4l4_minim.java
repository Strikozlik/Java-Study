/*Програма повинна зчитувати з клавіатури цілі числа доти, доки не буде введено щось інше:
 наприклад, рядок або символ. Виведи на екран мінімальне число серед уведених. Якщо введено
 кілька таких чисел, необхідно вивести будь-яке з них.
 Якщо введено лише нечисловий символ, слід вивести на екран максимальне значення числа типу int.*/
import java.util.Scanner;
public class L4l4_minim {
    public static void main(String [] args){
        Scanner x = new Scanner(System.in);
        int min=2000000000;
        int max =  2147483647;
        if(!x.hasNextInt())
            min=max;
        while (x.hasNextInt()){
            int a = x.nextInt();
            if (a<min)
                min = a;

        }System.out.println(min);

    }
}
