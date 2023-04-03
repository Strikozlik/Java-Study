public class SumKvadrMasiva {
    public static void main(String[] args) {
        int [] array = {1,2,2};
        System.out.println(SumKvadr(array));

    }public static int SumKvadr(int [] n){
        int sum = 0;
        for (int i =0;i< n.length;i++){
            sum = sum + (int)Math.pow(n[i],2);
        }return sum;
    }

}
