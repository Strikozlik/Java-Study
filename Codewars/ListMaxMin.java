package Codewars;

public class ListMaxMin {
    public static int min(int [] list){
        if(list.length<2){
            return list[0];
        }else{
            int min = list[0];
            for(int numbers : list){
                min = Math.min(min,numbers);
            }return min;
          }
        }


    public  static int max(int [] list){
        if(list.length<2){
            return list[0];
        }else {
            int max = list[0];
            for(int numbers:list){
                max = Math.max(max,numbers);

            }return max;
        }
    }

    public static void main(String[] args) {
        int [] mas ={1};
        System.out.println(max(mas));
        System.out.println(min(mas));
    }
}
