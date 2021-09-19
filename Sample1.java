import  java.util.Scanner ;                                      // імпорт бібліотеки для класу Scanner

public class Sample1 {
    public static void main(String [] args){
        Scanner console = new Scanner(System.in);             // створюєм нову змінну "console" типу сканер яка зсилається на обєкт класу сканер
         int x = console.nextInt();                           //cтворення обєкту класу int,який буде введено з клавіатури
         int y = console.nextInt();

        System.out.println(x+y);
    }
}
