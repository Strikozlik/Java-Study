import java.util.Scanner;
public class L4l4_BREAK {

/*
Показуємо, що отримуємо
*/

    public class Solution {
        public static void main(String[] args) {
            Scanner c = new Scanner(System.in);
            while (true){
                String s = c.nextLine();
                if(s.equals("enough"))
                    break;
                System.out.println(s);

            }


        }
    }

}
