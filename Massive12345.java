public class Massive12345 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Pavlo";
        person1.age = 35;


        Person bratyha = new Person();
        bratyha.name = "Oleks";
        bratyha.age = 35;
        bratyha.speak();
    }
}
class Person12 {
    String name;
    int age;

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + "," + "Im " + age + " old");
        }
    } void sayHello(){
        System.out.println("Hello!");
    }
}