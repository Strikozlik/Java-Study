package KatySira.TestConstr;

public class Animal {
    private String name;
    public String getName(){
        return name;
    }
    public Animal(String thename){
        name = thename;
        System.out.println("Створення тварина");
    }
    public void Say(){
        System.out.println("Hello");
    }
}
