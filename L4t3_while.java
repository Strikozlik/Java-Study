import java.util.Scanner;
public class L4t3_while {


        public static void main(String[] args) {
            Scanner x = new Scanner(System.in);  // створюэм змінну х типпу сканер

            int sum = 0;                        // декларуєм змінну sum і присвоюєм їй значення 0
            boolean end = false;                // декларуєм булеву змінну end  і присвоюєм їй значення false
            while (!end) {                      // починаэм цикл в умовы якого обернена булева зміна,falce==!true
                if (x.hasNextInt()) {           // оператор if вказуэ якщо введене з клавыатури число то виконуєм додавання
                    int a = x.nextInt();        // створення змінної а,яка набуває значень введених з клавіатури
                    sum = sum + a;              // вираз сумування всіх чисел введених з клавіатури
                } else if (x.hasNextLine()) {   // друга умова якщо введена стрічка
                    String l = x.nextLine();    // створення змінної l  типу стрічка
                    if (l.equals("ENTER")) {    // умова якщо введене з клавіатури дорівнює ENTER  то булевій змінній end
                        end = true;             // присвоюємзначення true. А оскільки в циклі  while вказана умова обернена
                    }                           // до зміннної то цикл  припиняє свою дію
                }
            }
            System.out.println(sum);            // виводиться сума на екран
        }



}

