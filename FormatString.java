public class FormatString {
    public static void main(String[] args) {
        System.out.println(format("Аміго", 5000,35));
    }

    public static String format(String name, int salary,int age) {
        String phrase = "Мене звати %s.Мені %3$d років. Я зароблятиму $%2$d на місяць. ";



        return String.format(phrase, name,salary,age);
    }
}

