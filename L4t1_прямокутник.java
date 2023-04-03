public class L4t1_прямокутник {
    public static void main(String[] args) {
        int a =0;
        while (a<10){
            int b=0;
            while(b<20){
                if (a==0){
                    System.out.print("Б");
                }
                else if(a==9){
                    System.out.print("Б");
                }
                else
                if(b!=0 && b!=19)
                    System.out.print(" ");
                else
                    System.out.print("Б");
                b++;

            }
            System.out.println("");
            a++;
        }
    }

}



