package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1 = getNumber();
        double num2 = getNumber();
        char operation = getOperation();
        double result = calc(num1,num2,operation);
        System.out.println("Результат " + result);

    }
    public static double getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число");
        if(sc.hasNextDouble()){
            return sc.nextDouble();
        }else{
            System.out.println("Помилка при вводі,повторіть спробу");
            return getNumber();
        }
    }
    public static char getOperation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Виберіть тип операції: 1 - додати, 2 - відняти,3 - помножити, 4 - поділити");
        int operation = 0;
        if(sc.hasNextInt()){
            operation= sc.nextInt();
        }else{
            System.out.println("Ви ввели не число,повторіть ввід");
            return getOperation();
        } switch (operation){
            case 1: return '+';
            case 2: return '-';
            case 3: return '*';
            case 4: return '/';
            default:
                System.out.println("Невірна операція,повторіть ввід");
                return getOperation();
        }
    }
    public static  double add(double num1,double num2){
        return num1+num2;
    }
    public static double sub(double num1,double num2){
        return num1-num2;
    }
    public static double mul(double num1,double num2){
        return num1*num2;
    }
    public static double div(double num1,double num2){
       if(num2!=0){
           return num1/num2;
       } else {
           System.out.println("На нуль ділити не можна");
           return Double.NaN;
       }
    }
    public static double calc(double num1,double num2,char operation){
        switch (operation){
            case '+': return add(num1,num2);
            case '-': return sub(num1,num2);
            case '*': return mul(num1,num2);
            case '/': return div(num1,num2);
            default:return Double.NaN;
        }
    }
}
