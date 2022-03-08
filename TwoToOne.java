import java.util.Arrays;

public class TwoToOne {
    public static String longest(String s1,String s2){
        String res = "";
        String s3 = s1+s2;
        char[] arr1 = s3.toCharArray();
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++){
            if(res.indexOf(arr1[i])<0){
                res +=arr1[i];
            }
        }return res;
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "def";
        System.out.println(longest(s1,s2));

    }
}
