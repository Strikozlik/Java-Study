import java.util.Scanner;
public class ChangeSomeElement {
    public static void main(String[] args) {
        String string = "Hello.My name is Pavlo. I'd lake to became a java junior developer. I try to learn programing himself.";
        System.out.println(changeElem(string));
    }
    public static String changeElem(String x){
        Scanner a = new Scanner(System.in);
        System.out.println("Введіть символ який треба змінити");
        String y = a.nextLine();
        System.out.println("Введіть символ на який треба поміняти");
        String z = a.nextLine();
     String s = x.replace(y,z);
     return s;
    }
}
