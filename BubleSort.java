import java.util.Arrays;

public class BubleSort {
    public static void main(String[] args) {
        int[] mas = {1, 3, 6, 2, 4, 7, 9};
        boolean isSortet = false;
        int buf;
        while(!isSortet){
         isSortet=true;
            for(int i=0;i<mas.length-1;i++){
                if(mas[i]>mas[i+1]){
                    isSortet = false;
                    buf=mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }

        }
        System.out.println(Arrays.toString(mas));
    }
}