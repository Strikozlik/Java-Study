public class SequenceSum {
    public static String showSequence(int value) {
        if (value < 0)
            return  value + "<0";
        if(value == 0)
            return value + "=" +0;
        int sum =0;
        String s = "0";
        int [] array = new int [value+1];
        for(int i = 1;i<=value;i++){
            array[i] = i;
            s += "+" + array[i];
            sum += i;
        }return s +"="+ sum;
    }

    public static void main(String[] args) {
        System.out.println(showSequence(-15));
    }

}

/*public class SequenceSum{

  public static String showSequence(int value){

    if (value < 0)
      return value + "<0";

    if (value == 0)
      return "0=0";

    int sum = 0;
    String result = "0";

    for (int i = 1; i <= value; i++) {
      result += "+" + i;
      sum += i;
    }

    return result += " = " + sum;
  }
  */
