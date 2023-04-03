

import  java.util.Scanner ;
/* Веедення даних з клавіатури і перевірка на правильність введення*/

public class Sample3 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your name");

        if (s.hasNextLine()){
            String name = s.nextLine();
            System.out.println("Please,enter your Age");}
        if (s.hasNextInt()) {
            int age = s.nextInt();
            System.out.println("Thank you,enter your phone number");}
        if (s.hasNextInt()){
            int number = s.nextInt();
            System.out.println("Thank you,we well contact you");
        } else {
            System.out.println("Please enter correctly information");

        }


    }
}
