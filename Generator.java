public class Generator {
    public static void main(String[] args) {
        String [] words1 = {"Цілодобовий","Щоденний", "Гарячий","Перспективний","Ймовірний","Смердючий","Великий","Смішний"};
        String [] words2 = {"Глибокий","Відчайдушник","Сміливий","Дальновидний","Скажений","Орієнтовний","Ціленаправлений"};
        String [] worsd3 = {"Портал","Огірок","Пес","Корабель","Вазонок","Диван","Дощ"};
        int word1 = words1.length;
        int word2 = words2.length;
        int word3 = worsd3.length;

        int rand1 =(int) (Math.random()*word1);
        int rand2 =(int) (Math.random()*word2);
        int rand3 =(int) (Math.random()*word3);

        String result = words1[rand1] +" "+ words2[rand2] +" "+ worsd3[rand3];
        System.out.println(result);

    }
}
