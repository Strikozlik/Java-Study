package Codewars;

public class CountTheCharacter {
    public static void main(String[] args) {
        System.out.println(charCount("Decora.Lesia",'i'));

    }

    public static int charCount(String str, char c) {
       String[] ch = str.toLowerCase().split("");
       String ch1 =c+"";
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch1.equalsIgnoreCase(ch[i])) {
                count++;
            }
        }
        return count;
    }
}
