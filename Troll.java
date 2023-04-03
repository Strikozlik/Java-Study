public class Troll {
    public static void main(String[] args) {
        String str = "Hello all.ThIs site is fo loosers lLOOOLL";
        System.out.println(disemvowel(str));
    }

        public static String disemvowel(String str) {
            return str.replaceAll("[aAeEiIoOuU]", "");
        }
    }

   /* public static String disemvowel(String str) {
        String trol = "";
        String result = str;
        String[] array = {"a", "A", "e", "E", "i", "I", "o", "O", "u", "U"};
        for (int i = 0; i < array.length; i++) {
            result = result.replace(array[i], trol);
        }return result;
    }
}*/
       /* String resulto = str.replace("a" ,trol);
        String resulta = resulto.replace("o",trol);
        String resulte = resulta.replace("e",trol);
        String resulti = resulte.replace("i",trol);
        String resultu = resulti.replace("u",trol);
        String resultO = resultu.replace("O",trol);
        String resultA = resultO.replace("A",trol);
        String resultE = resultA.replace("E",trol);
        String resultI = resultE.replace("I",trol);
        String resultU = resultI.replace("U",trol);
     return resultU;
    }
} */