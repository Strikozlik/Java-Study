
//Учитывая строку слов, вам нужно найти слово с наибольшей оценкой.
//
//Каждая буква слова оценивается в баллах в соответствии с ее положением в алфавите: a = 1, b = 2, c = 3 и т. Д.
//
//Вам нужно вернуть слово с наибольшей оценкой в ​​виде строки.
//
//Если два слова имеют одинаковый балл, верните слово, которое встречается раньше всего в исходной строке.
//
//Все буквы будут строчными, и все введенные данные будут действительными.
public class Kata {
    public static void main(String[] args) {
        String x=  "Hello world and Java";
        System.out.println(high(x));
    }

    public static String high(String s) {

                String winner = "";
                int highScore = 0;

                for (String word : s.split(" ")) {
                    int score = 0;
                    for (char c : word.toCharArray()) {
                        score += c - 'a' + 1;
                    }
                    if (score > highScore) {
                        winner = word;
                        highScore = score;
                    }
                }

                return winner;
            }

        }