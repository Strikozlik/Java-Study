package KatySira;

public class TestArrays {
    public static void main(String[] args) {
        int [] index = new int[4];
        String [] islands = new String[4];
         int y =0;
          islands[0] = "Bermudes";
          islands[1] = "Fidgy";
          islands[2] = "Azorik islands";
          islands[3] = "Cosumel";

          index[0] = 1;
          index[1] = 3;
          index[2] = 0;
          index[3] = 2;
        int ref;
        while(y<4){
            ref = index[y];
            System.out.println(islands[ref]);
            y=y+1;

        }
    }
}
