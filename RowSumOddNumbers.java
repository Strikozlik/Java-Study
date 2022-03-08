public class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        int sum =0;
        for(int i = n*n -(n-1);i<=n*n +(n-1);i++){
            if(i%2 !=0)
            sum+=i;
        }return sum;
    }

    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(42));

    }
}
