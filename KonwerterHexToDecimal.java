import java.util.regex.Pattern;
public class KonwerterHexToDecimal {


/*
Шістнадцятковий конвертер
*/


        private static final String HEX = "0123456789abcdef";

        public static void main(String[] args) {
            int decimalNumber = 1256;
            System.out.println("Десяткове число " + decimalNumber + " дорівнює шістнадцятковому числу " + toHex(decimalNumber));
            String hexNumber = "4e8";
            System.out.println("Шістнадцяткове число " + hexNumber + " дорівнює десятковому числу " + toDecimal(hexNumber));
        }

        public static String toHex(int decimalNumber) {
            String hex = "";
            int i =0;
            while (decimalNumber!=0){
                if(decimalNumber<=0){
                    return hex;
                }
                int index =decimalNumber%16;
                hex = HEX.charAt(index)+hex;
                decimalNumber=decimalNumber/16;
            }return hex;



        }

        public static int toDecimal(String hexNumber) {
            int dec = 0;
            if(hexNumber ==null){
                return dec;
            }
            for(int i =0;i<hexNumber.length();i++){
                int sym =hexNumber.charAt(i);
                dec =16*dec+HEX.indexOf(sym) ;
            }return dec;


        }
    }


