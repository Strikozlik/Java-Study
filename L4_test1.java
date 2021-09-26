public class L4_test1 {
    public static void main(String[] args) {
        int sum = 0;    // итоговая сумма

        int i = 0;      // стартовое число ряда
        int count = 20; // количество чисел
        while (i <= count) {
            i++;        // берем очередное число, i++ эквивалентно i=i+1
            if (i * i <= count)  // если квадрат числа меньше
                continue;   // количества чисел - сумму не считаем
            // переходим к следующему числу в цикле
            sum += i * i * i; // иначе считаем сумму кубов чисел
        } // sum += i*i*i - форма записи, аналогичная sum = sum + i*i*i
        System.out.println(sum);// печатаем результат
    }

}