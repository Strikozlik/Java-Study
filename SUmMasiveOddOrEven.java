public class SUmMasiveOddOrEven {
    public static void main(String[] args) {
        int[] test = {1,2,3,4,5,7,7,8};
        System.out.println(oddOrEven(test));
    }
    public static String oddOrEven (int[] array) {
        int sum = 0;
        for(int i :array){
            sum +=i;
        }return sum%2 ==0 ? "even" : "odd";
    }
    }
       /* int sum = 0;
        String res = "";
        for(int i = 0;i<array.length;i++){
            sum+=array[i];
            if(sum%2 ==0){
                res ="even";
            }
            else res = "add";
        }return res;

    }
}*/
