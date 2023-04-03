import java.util.ArrayList;
import java.util.Random;
public class ArraysListPraktika {
    public static void main(String[] args) {
        ArrayList<Integer> mass = new ArrayList<Integer>();
        Random random = new Random();
        int n = random.nextInt(100);
        for(int i =0;i<n;i++){
            mass.add(random.nextInt(100));
        }
        for(int i =0;i< mass.size();i++){
            System.out.print(mass.get(i) + " ");
        }
        sort(mass);
        System.out.println();
        for(int i =0;i< mass.size();i++){
            System.out.print(mass.get(i) + " ");
        }
        for(int i =0;i<mass.size();i++){
            if(mass.get(i)%3 ==0){
                mass.remove(i);
                i--;
            }
        }
        System.out.println();
        for(int i =0;i< mass.size();i++){
            System.out.print(mass.get(i) + " ");
        }
    }
    public static ArrayList sort(ArrayList<Integer>mass){
        for(int i = 0;i< mass.size()-1;i++){
            for(int j=0;j< mass.size()-i-1;j++){
                if(mass.get(j)> mass.get(j+1)){
                    int temp = mass.get(j);
                    mass.set(j,mass.get(j+1));
                    mass.set(j+1,temp);
                }
            }
        }return mass;
    }

}


