public class GetterSetter {
    public static void main(String[] args) {
        Gerson gerson1 = new Gerson("Pavlo",35);
        //gerson1.setName("Pavlo");
       // gerson1.setAge(35);
        Gerson gerson2 = new Gerson("Sania",-35);


        System.out.println("Доброго дня " + gerson1.getName() + " Вам " + gerson1.getAge() + " Вам до пенсії " + gerson1.pensia(gerson1.getAge()) );
        System.out.println("Доброго дня " + gerson2.getName() + " Вам " + gerson2.getAge() + " Вам до пенсії " + gerson2.pensia(gerson2.getAge()) );

    }

}
class Gerson{
    private String name;
    private int age;
    public Gerson(String name,int age){
        if(age>0){
            this.age = age;
        } else
            System.out.println("Введіть коректні дані");

        if(name!=null){
            this.name = name;
        }else
            System.out.println("Введіть імя");

    }
    public void setName(String username){
        if(username.isEmpty()){
            System.out.println("Ти ввів пусте імя");
        } else {
            name = username;}
        }

    public String getName() {
        return name;
    }
    public void setAge(int userAge){
        if(userAge<0){
            System.out.println("Ти ввів відємний рік");
        }else {
            age=userAge;
        }
    }
    public int getAge(){
        return age;
    }
    int pensia (int age){
        int penc;
        penc = 65-age;
        return penc;
    }
}


