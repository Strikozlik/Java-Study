import java.util.Scanner;                        //підключення пакету для роботи зі Scanner

public class Input {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);       //з допомогою "new"  створюєм обєкт класу Scanner
        System.out.println("Введіть число");      //"s" зсилається на створений обєкт класу Scanner
        int x = s.nextInt();                      //Декларація змінної "x" яку вводим з клавіатури
        System.out.println("Ви ввели " +x);       //s/nextInt()  - метод який зчитує з клавіатури введені дані,1 рядок,до нажаття "Еnter"
    }
}
