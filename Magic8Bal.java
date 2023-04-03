import java.util.Random;
public class Magic8Bal {
    public static void main(String[] args) {
        System.out.println("Чи стану я програмістом");
        System.out.println(EightBall.randomizer());
    }

    public class EightBall {
        private static final String yes = "Так,звичайно";
        public static final String yesok = "Так,безумовно";
        public static final String okey = "Так і досить успішним";
        public static final String ofc = "Так і це буде дуже весело";
        public static final String allright = "Так,це буде нелегко але цікаво";
        public static final String hard = "Так,це буде важко але є ради чого  старатись";
        public static final String friend = "Так,вас надихнуть ваші друзі";
        public static final String family = "Так,ваша сімя зрадіє";

        public static String randomizer() {
            Random x = new Random();
            int random = x.nextInt(8);
            switch (random) {
                case 0:
                    return yes;
                case 1:
                    return yesok;
                case 2:
                    return okey;
                case 3:
                    return ofc;
                case 4:
                    return allright;
                case 5:
                    return hard;
                case 6:
                    return friend;
                case 7:
                    return family;
                default:
                    return null;
            }
        }
    }
}