import java.util.regex.Pattern;

public class KowerterDecimalBinary {

/*
Двійковий конвертер
*/


        public static void main(String[] args) {
            int decimalNumber = Integer.MAX_VALUE;
            System.out.println("Десяткове число " + decimalNumber + " дорівнює двійковому числу " + toBinary(decimalNumber));
            String binaryNumber = "1111111111111111111111111111111";
            System.out.println("Двійкове число " + binaryNumber + " дорівнює десятковому числу " + toDecimal(binaryNumber));
        }

        public static String toBinary(int decimalNumber) {
            String temp = "";
            if(decimalNumber<=0)
                return temp;
            int i =0;
            String binary = "";
            while(decimalNumber!=0){
                binary = decimalNumber%2 + binary;
                decimalNumber=decimalNumber/2;

            }return binary;
        }
        public static int toDecimal(String binaryNumber) {
            int decimal = 0;
            if(binaryNumber == null)
                return decimal;
            for(int i=0;i<binaryNumber.length();i++){
                int index = binaryNumber.length()-1-i;
                int value =Character.getNumericValue(binaryNumber.charAt(index));
                decimal += value * Math.pow(2, i);
            }return decimal;
        }
    }


