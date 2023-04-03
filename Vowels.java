public class Vowels {
    public static int getCount(String str) {
       /* int vowelsCount = 0;
        String vowel = "aeiou";
        char[] strings = str.toCharArray();
        for(int i=0;i<strings.length;i++){
            if (vowel.indexOf(strings[i]) >= 0){
                vowelsCount++;

            }
        }return vowelsCount;
    }*/
        int vowelsCount = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelsCount++;
            }
        }return vowelsCount;
    }





    public static void main(String[] args) {
        String test = "Pavlo and";
        System.out.println(getCount(test));
    }
}
