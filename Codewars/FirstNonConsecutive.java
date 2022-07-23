package Codewars;

public class FirstNonConsecutive {
    static Integer find(final int [] array){
        if (array.length<2){
            return null;
        }
        for(int i =0;i<array.length-1;i++) {
            if(array[1]-array[0] == array[array.length-1] - array[array.length-2]){
                int con = array[1] - array[0];
                if(array[i+1]-array[i]!=con){
                    return array[i + 1];
                }
            } else {
                int cons = array[2]-array[1];
                    if(array[i+1]-array[i] != cons){
                        if(i!=0){
                            return array[i+1];
                        }
                        return array[i];
                    }
            }
        }return null;
    }

    public static void main(String[] args) {
         int[]array = new int []{0,5,10,15,20,25,29,35};
        System.out.println(find(array));

    }
}
