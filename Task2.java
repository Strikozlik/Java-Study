import java.sql.SQLOutput;

public class Task2 {
    /*Перетворення рядків у числа !!!У змінну hugeAmount потрібно записати число 100500.
Використовуй змінні bigAmount, greatAmount і перетворення рядка на число.
Для оголошення та ініціалізації змінної hugeAmount використовуй одну команду.
*/
    public static void main(String [] args){
          String bigAmount = "500";
          String greatAmount = "100000";
          int hugeAmount = Integer.parseInt(greatAmount)+Integer.parseInt(bigAmount);
        System.out.println(hugeAmount);


    }
}
