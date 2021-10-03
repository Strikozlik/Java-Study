public class Tablicja_mnogen9 {
    public static void main(String[] args) {

        for (int i = 1; i < 20; i++) {
            for (int k = 1; k < 20; k++) {
                if (k*i == 1)
                    System.out.print("   ");
                else
                System.out.print(k * i + "    ");
            }
            System.out.println("");
        }
    }
}





