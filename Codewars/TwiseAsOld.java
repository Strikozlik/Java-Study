package Codewars;

public class TwiseAsOld {
    public static int TwiceAsOld(int dadYears, int sonYears) {
        int count = 0;
        if((double)dadYears/sonYears>2) {
            while ((double) dadYears / sonYears != 2) {
                dadYears++;
                sonYears++;
                count++;
            }
        }else {
            while ((double) dadYears / sonYears != 2) {
                dadYears--;
                sonYears--;
                count++;

            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(TwiceAsOld(45, 25));
    }
}
