import java.util.Scanner;

public class array_видалення_однакоих_рядків {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String[] strings = new String[5];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = x.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            String currentString = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (currentString == null) {
                    break;
                }
                if (currentString.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}