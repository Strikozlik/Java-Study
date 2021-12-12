public class CountingDuplicates {
    public static void main(String[] args) {
        String s = "Helloe";
        System.out.println(duplicateCount(s));

    }

    public static int duplicateCount(String text) {
        int res = 0;
        String[] array = text.split("");
        for (int i = 0; i < array.length ; i++) {
          //  String s = String.valueOf(text.charAt(i));

                res++;

            }return res;
        }


    }

}
}

