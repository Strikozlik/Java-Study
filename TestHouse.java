import java.util.ArrayList;
import java.util.TreeSet;

public class TestHouse {
    public static void main(String[] args) {
       ArrayList<House> myHouseArraylist = new ArrayList<House>();

        House firstHouse = new House(100,120000,"Tokyo",true);
        House secondHouse = new House(40,70000,"Oxford",true);
        House thirdHouse = new House(70,180000,"Paris", false);

        myHouseArraylist.add(firstHouse);
        myHouseArraylist.add(secondHouse);
        myHouseArraylist.add(thirdHouse);

        for(House h:myHouseArraylist){
            System.out.println(h);
        }
        PriceComparator priceComparator = new PriceComparator();
        myHouseArraylist.sort(priceComparator);

        System.out.println("Sorted: ");
        for (House h:myHouseArraylist){
            System.out.println(h);
        }
    }
}
