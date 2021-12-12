import java.util.*;

public class CollectionMetod {
    public static void main(String[] args) {
        List<Integer> numbers =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        numbers.forEach(s-> System.out.print(s+ " "));
        System.out.println();
        numbers.removeIf(s-> s>5);
        numbers.forEach(s-> System.out.print(s+ " "));
        System.out.println();

        Map<String, String> books = new HashMap<>();
        books.put("Война и мир","Лев Толстой");
        books.put("Преступление и наказание","Федор Достоевский");
        books.put("Философия Java","Брюс Эккель");
        books.put("Братья Карамазовы","Федор Достоевский");
        books.put("Властелин колец","Джон Толкин");
        books.forEach((a,b) -> System.out.println("Назва книги: " + a + ". Автор: " + b ));
        books.compute("Философия Java",(a,b) -> b + " Крутой чувак");
        books.forEach((a,b) -> System.out.println("Назва книги: " + a + ". Автор: " + b ));
        books.computeIfAbsent("Гарри Поттер и узник Азкабана",b->getHarryPotterAuthor());
        books.forEach((a,b) -> System.out.println("Назва книги: " + a + ". Автор: " + b ));
        books.computeIfPresent("Братья Карамазовы",(a,b)-> b = "Александр Пушкин");
        books.forEach((a,b) -> System.out.println("Назва книги: " + a + ". Автор: " + b ));

        String igor = books.getOrDefault("Властелин колец","Неизвестный автор");
        System.out.println(igor);
        books.merge("Властелин колец","Джон Толкин", (a,b)->  " Арагорн");
        books.forEach((a,b) -> System.out.println("Назва книги: " + a + ". Автор: " + b ));

        books.putIfAbsent("Володар Перстнів","Джон Толкін");
        books.forEach((a,b) -> System.out.println("Назва книги: " + a + ". Автор: " + b ));




    }
    public static String getHarryPotterAuthor(){
        return  "Джон Роулинг";
    }
}
