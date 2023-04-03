package KatySira;

public class StaticSuper {
    static {
        System.out.println("Батьківський статичний блок");
    }
    StaticSuper() {
        System.out.println("Батьківський конструктор");
    }
}
class StaticTests extends StaticSuper{
    static int rand;
    static {
        rand = (int)(Math.random()*6);
        System.out.println("Статичний блок " + rand);
    }
   StaticTests(){
        System.out.println("Конструктор");
    }

    public static void main(String[] args) {
        System.out.println("Всередині методу мейн");
        StaticTests st =  new StaticTests();
    }
}