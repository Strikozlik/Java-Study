package KatySira;
import java.util.*;

public class ArrayListMagnet {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add(0,"Нуль");
        a.add(1,"Один");
        a.add(2,"Два");
        a.add(3,"Три");
        printAl(a);
        a.remove(2);
        if(a.contains("Три")){
            a.add("Чотири");
        }
        printAl(a);

        if(a.indexOf("Чотири")!=4){
            a.add(4,"4.2");
        }
        printAl(a);
        if(a.contains("Два")){
            a.add("2.2");
        }
        printAl(a);



    }
    public static void printAl(ArrayList<String> al){
        for(String element : al){
            System.out.print(element + " ");
        }System.out.println(" ");
    }
}
