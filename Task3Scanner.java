import java.util.Scanner ;
public class Task3Scanner {
    public static void main(String [] args){

        Scanner console = new Scanner(System.in);   // створюємо обєкт класу Scanner
         String name = console.nextLine();          //читаємо з клавіатури рядок тексту
          int Age = console.nextInt();               //читаэмо число введене з клавіатури
        System.out.println("Name" + name);           //виводимо на екран введений рядок тексту
        System.out.println("Age" + Age);            //виводимо на екран введене число

    }
}
