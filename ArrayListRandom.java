import java.util.ArrayList;

public class ArrayListRandom {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        addNum(list);
        int res = (int)(Math.random()*10);
        System.out.println(res);
        System.out.println(findResult(list,res));

    }
    public static void addNum(ArrayList<Integer>list){
        for(int i=0;i<100;i++){
            list.add((int)(Math.random()*10));
        }
    }
    public static int findResult(ArrayList<Integer>list,int number){
        int count = 0;
        Integer [] res = list.toArray(new Integer[0]);
        for(int i =0;i< list.size()-1;i++){
            System.out.print(res[i] + " ");
            if(res[i] == number){
                count++;
            }

        }System.out.println();
        return count;
    }
}
