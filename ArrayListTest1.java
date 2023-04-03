import java.util.ArrayList;

public class ArrayListTest1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(2);
        Integer[] res =list.toArray(new Integer[0]);
        for(int i =0;i<res.length;i++){
            if(res[i]==2){
                count++;
            }

        }System.out.println(count);

    }
}
