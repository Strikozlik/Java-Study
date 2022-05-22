public class TestOcinku {

    public static void main(String[] args) {
        int [] arr = {0, 1, 0, 0, 2, 1, 0, 2, 2, 1};
        int x = 3;
        int y = -1;
        int z = 2;
        System.out.println(sol(arr,x,y,z));
    }
    public static int sol(int [] arr, int x, int y, int z){
        int sum =0;
        int countx = 0;
        int county = 0;
        int countz = 0;
        for(int i =0;i<arr.length;i++){
            if (arr[i]==0){
                countx++;
            } if(arr[i] == 1){
                county++;
            } if (arr[i] == 2){
                countz++;
            }
        }return sum = countx*x + county*y - countz*z;
    }
}
