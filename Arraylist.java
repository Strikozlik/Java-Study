import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>mass = new ArrayList<Integer>();
        for(int i =0;i<20;i++){
             if(i%2 == 0){
                 mass.add(i);
             }
        }
        for(int i =0;i<mass.size();i++){
            System.out.println(mass.get(i));
        }
        for(int i =0;i< mass.size();i++){
            if(mass.get(i)%4 ==0){
             mass.remove(i);
             i--;
            }
        }
        for(int i =0;i<mass.size();i++){
            System.out.println(mass.get(i));
        }
    }
}
