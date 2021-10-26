public class Order {
    public static void main(String[] args) {
        int x =21568942;


        System.out.println(numberDil(x));
    }
    public static long numberDil(int n) {
        int sum =0;
        for(int i =1;i<=n;i++){
            if (n%i == 0)
                    sum=sum+1;

        }return sum;
    }
}
//вивести масив чисел які є дільниками числа х

