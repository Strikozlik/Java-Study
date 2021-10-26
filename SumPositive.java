public class SumPositive {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,-9,-5};
        System.out.println(sum(array));
    }

    public static int sum(int[] arr){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>0){
                sum=sum+arr[i];
            }
        }
        return sum;
    }
}

/*public class Positive{

  public static int sum(int[] arr){
    // check for emtpy array
    if(arr.length == 0) return 0;
    // add all positive ints to the sum & return the result
    else {
      int sum = 0;
      for(int num : arr){
        sum = (num > 0 ? sum + num : sum);
      }
      return sum;
    }
  }

}*/