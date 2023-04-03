public class Konstructor {
    public static void main(String [] args){
        Humanoid humanoid1 = new Humanoid("Asteriks",1029);
        humanoid1.getInfo();

    }
}
class Humanoid{
    private String name;
    private int age;

    public Humanoid(){
        System.out.println("Hello,from first construktor");
        this.name = "Імя невідоме";
        this.age = 0;

    }
    public Humanoid(String name){
        System.out.println("Hello from second construktor");
        this.name = name;
    }
    public Humanoid(String name,int age){
        System.out.println("Hello from third construtor");
        this.name = name;
        this.age = age;
    }
    public void getInfo(){
        System.out.println(name + "," + age);
    }

}