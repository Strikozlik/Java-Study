import java.util.regex.Pattern;

/*
Вісімковий конвертер
*/

    public class Kowerter {
        public static void main(String[] args) {
            int decimalNumber = 21;
            System.out.println("Десяткове число " + decimalNumber + " дорівнює вісімковому числу " + toOctal(decimalNumber));
            int octalNumber = 25;
            System.out.println("Вісімкове число " + octalNumber + " дорівнює десятковому числу " + toDecimal(octalNumber));
        }

        public static int toOctal(int decimalNumber) {
            if(decimalNumber<=0)
                return 0;
            int i=0;
            int octal = 0;
            while(decimalNumber!=0){
                octal = (int)octal+(int)(decimalNumber%8*Math.pow(10,i));
                decimalNumber = decimalNumber/8;
                i++;
            }
            return octal;
        }


        public static int toDecimal(int octalNumber) {
            if(octalNumber<=0)
                return 0;
            int i =0;
            int decim = 0;
            while (octalNumber!=0){
               decim = (int)decim+(int)(octalNumber%10*Math.pow(8,i));
               octalNumber = octalNumber/10;
               i++;
            }return decim;
        }
    }


