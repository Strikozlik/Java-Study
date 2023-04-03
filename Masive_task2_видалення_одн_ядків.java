import java.util.Scanner;
public class Masive_task2_видалення_одн_ядків {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);                              //створення змінної х  класу сканер
        strings = new String[6];                                         // створення масиву "strings" з 6 рядками
        for (int i = 0; i < 6; i++) {                    // заповнюэм масив ввдеденими рядками з консолі
            strings[i] = x.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {          // створюєм цикл для порівнняння поточної лінії з наступними
            String currentString = strings[i];             //присвоюєм поточній лінії значення певного рядка масиву
            for (int j = i + 1; j < strings.length; j++) {   //цикл  в циклі,для порівняння поточної лінії з наступними
                if (currentString == null) {               //умова,якщо поточна лінія null,припиняэм цикл
                    break;
                }
                if (currentString.equals(strings[j])) {       //умова якщо поточна лінія буде рівна з будь якою з наступних
                    strings[j] = null;                      // то їм обом  присвоїться значення null
                    strings[i] = null;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {              //виводим на екран результат програми
            System.out.print(strings[i] + ", ");
        }
    }
}


