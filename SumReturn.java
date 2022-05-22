public class SumReturn {
    public static void main(String[] args) {
        int a = -1;
        int b = 2;
        System.out.println(getSum(a,b));
    }



    public static  int getSum(int a,int b){
        int sum = 0;
        if(a==b){
            sum = a;}
        else if(a>b){
            for(int i =b;i<=a;i++){
                sum+=i;
            }
        }
        else if(b>a){
            for(int i =a;i<=b;i++){
                sum+=i;
            }
        }return sum;
    }
}
