import java.util.ArrayList;
import java.util.Iterator;

public class ListNames {
    public static void main(String[] args) {
        ArrayList<String>names = new ArrayList<String>();
        ArrayList<String>surnames = new ArrayList<String>();

        names.add("Коля");
        names.add("Петя");
        names.add("Ваня");
        names.add("Вася");

        surnames.add("Колян");
        surnames.add("Петян");
        surnames.add("Ванян");
        surnames.add("Васян");

        Iterator iterNames = names.iterator();
        Iterator iterSurnames = surnames.iterator();
        while(iterNames.hasNext()){
            while ((iterSurnames.hasNext())){
                System.out.println(iterNames.next() + " " + iterSurnames.next());
            }
        }
       /* for(String surname : surnames){
            for (String name : names){
                System.out.println(name + " " + surname);
            }
        }*/
    }
}
