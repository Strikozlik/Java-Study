package Codewars;

public class CharProblem {
    public static int howOld(final String herOld){
        char [] mas =herOld.toCharArray();
        String res1 = ""+ mas[0];
        int res =Integer.parseInt(res1);

        return res;
    }

    public static void main(String[] args) {
        String herOld = "7 years old";
        System.out.println(howOld(herOld));
    }

}
