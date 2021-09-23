public class L4l4_continue {
    public static void main(String [] args){
        int sum = 0;
        int a =0;
        while(a<=100){
            if ( (a%3) == 0) {
                a++;
                continue;
            }
            sum = sum+a;
            a++;
        }
        System.out.println(sum);

    }
}
