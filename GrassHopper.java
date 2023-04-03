public class GrassHopper {
    public static void main(String[] args) {
        int sum = summation(3);
        System.out.println(sum);

    }
    public static int summation(int n) {
        int sum=0;
        while (n>0){
            sum=sum+n;
            n=n-1;
        }

        return sum;
    }
}
/*public class GrassHopper {

    public static int summation(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
        sum += i;

        }
    return sum;
    }
}*/
/*public class GrassHopper {

    public static int summation(int n) {

        return  n*(n+1)/2;
    }
}*/