public class Masive_task3_trukytn {
    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        result = new int[10][];
        result[0] = new int[1];
        result[1] = new int[2];
        result[2] = new int[3];
        result[3] = new int[4];
        result[4] = new int[5];
        result[5] = new int[6];
        result[6] = new int[7];
        result[7] = new int[8];
        result[8] = new int[9];
        result[9] = new int[10];


        for (int x = 0; x < result.length; x++) {
            for (int y = 0; y < result[x].length; y++) {
                result[x][y] = x + y;
                System.out.print(result[x][y] + " ");
            }
            System.out.println();

        }
    }
}