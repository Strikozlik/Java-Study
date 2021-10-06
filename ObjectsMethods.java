public class ObjectsMethods {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Pavlo",35);

        person1.food = "Pelmeni";
        person1.speak();
        int year1 = person1.calculateYearsToRetirement();
        Person person2 = new Person();
        String s1 = "Sania";
        person2.setNameAndAge(s1,50);

        person2.food = "Hinkali";
        person2.speak();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("Павлові до пенсії " + year1 + " років");
        System.out.println("Сашку до пенсії " + year2 + " років");
    }
}
class Person{
    String name;
    int age;
    String food;
    void setNameAndAge(String username,int userage){
        name = username;
        age = userage;

    }
    int calculateYearsToRetirement(){
        int years =65 - age;
        return years;
    }
    void speak(){
        System.out.println("My name is " + name + " I'm " + age + "old." + "I like " + food );
    }
}
