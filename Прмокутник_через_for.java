public class Прмокутник_через_for {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 0 || i == 4)
                for (int b = 0; b < 10; b++)
                    System.out.print("C");
            if (i != 0 && i != 4)
                for (int b = 0; b < 10; b++) {
                    if (b == 0 || b == 9) {
                        System.out.print("C");
                    } else System.out.print(".");
                }
            System.out.println();


        }
    }
}
