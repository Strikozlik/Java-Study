public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "бутылок(бутылки)";
        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "Бутилка";
            }
            System.out.println(beerNum + " " + word + "пива на стене");
            //System.out.println(beerNum + " " + word + " пива");
            System.out.println("Візьми одну");
            System.out.println("Пусти по кругу");
            beerNum = beerNum - 1;

            }
                System.out.println("Нет пива на стене");

            }
        }



