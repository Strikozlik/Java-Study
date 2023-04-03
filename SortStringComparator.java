import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortStringComparator {
    public static void main(String[] args) {
        ArrayList<String> list =  new ArrayList<String>();
        Collections.addAll(list,"Привіт","як","справи");
        Collections.sort(list,new StringLengthComparator());
        for(String s :list){
            System.out.println(s);
        }
    }
}

class StringLengthComparator implements Comparator<String> {

    public  int compare(String obj1, String obj2){
      return obj1.length() - obj2.length();
    }

}
