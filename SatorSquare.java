public class SatorSquare {
    public static boolean isSatorSquare(char[][] tablet) {
        String line1 = "";
        String line2 = "";
        String line3 = "";
        String line4 = "";
        String diagonale1 = "";
        String diagonale2 = "";
        String diagonale1reverse = "";
        String diagonale2reverse = "";
        for (int i = 0; i < tablet.length; i++) {
            line1 += tablet[i][0];
        }
        for (int j = 0, i = 0; j < tablet[i].length; j++) {
            line2 += tablet[0][j];
        }
        for (int i = tablet.length - 1, j = tablet.length - 1; i >= 0; i--) {
            line3 += tablet[i][j];

        }
        for (int  i = tablet.length - 1, j = tablet.length - 1; j >= 0; j--) {
            line4 += tablet[i][j];
        }
        for(int i = tablet.length/2,j=0;j<tablet[i].length;j++){
            diagonale1+=tablet[i][j];
        }
        for(int i = tablet.length/2,j= tablet[i].length-1;j >= 0; j--){
            diagonale1reverse+=tablet[i][j];
        }
        for(int i=0,j=tablet.length/2;i< tablet.length;i++){
            diagonale2+=tablet[i][j];
        }
        for (int i = tablet.length-1,j=tablet.length/2;i>=0;i--){
            diagonale2reverse+= tablet[i][j];
        }

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(diagonale1);
        System.out.println(diagonale1reverse);
        System.out.println(diagonale2);
        System.out.println(diagonale2reverse);

        if(line1.equals(line2) && line1.equals(line3) && line1.equals(line4)){
            return diagonale1.equals(diagonale2) && diagonale1.equals(diagonale1reverse);
        }

        return false;
    }


    public static void main(String[] args) {
        char[][] tablet = {{'A', 'H'}, {'H', 'A'}};
        System.out.println(isSatorSquare(tablet));
    }
}
