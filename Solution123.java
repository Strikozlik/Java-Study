import java.util.Arrays;
import java.util.Scanner;





    public class Solution {

        public static void main(String[] args) {


            int [] intArray =getArrayOfTenElements();
            System.out.println(min(intArray));
        }

        public static int min(int [] intArray) {
            int [] min = intArray;
            int x = Math.min(min[0],Math.min(min[1],Math.min(min[2],Math.min(min[3],Math.min(min[4],Math.min(min[5],
                    Math.min(min[6],Math.min(min[7],Math.min(min[8],min[9])))))))));
            return x;
        }

        public static int[] getArrayOfTenElements() {
            Scanner scan = new Scanner(System.in);
            int [] mas = new int[10];
            for(int i =0;i<10;i++){
                mas[i]=scan.nextInt();
            }return mas;

        }
    }


