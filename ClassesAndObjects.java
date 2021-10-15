public class ClassesAndObjects {
    public static void main(String[] args) {
            Person person1 = new Person();
            person1.name = "Pavlo";
            person1.age = 35;
            person1.food = "Pelmeni";
            person1.speak();
            Person1 person2 = new Person1();
            person2.name = "Sania";
            person2.age = 35;
            person2.food = "Hinkali";
            person2.speak();
        }
    }
    class Person{
        String name;
        int age;
        String food;
        void speak(){
            System.out.println("My name is " + name + " I'm " + age + "old." + "I like " + food );
        }
    }
