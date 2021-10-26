public class PangramChecker {
    public static void main(String[] args) {
        String s = "qwertyuioplkjhgfdsazxcvbnm";
        System.out.println(check(s));
    }
    public static boolean check(String sentence){
        String x = sentence.toLowerCase();
        if(x.contains("a") && x.contains("b") && x.contains("c") && x.contains("d")
                && x.contains("e") && x.contains("f") && x.contains("g")
                && x.contains("h") && x.contains("i") && x.contains("j")
                && x.contains("k") && x.contains("l") && x.contains("m")
                && x.contains("n") && x.contains("o") && x.contains("p")
                && x.contains("q") && x.contains("r") && x.contains("s")
                && x.contains("t") && x.contains("u") && x.contains("v")
                && x.contains("w") && x.contains("x") && x.contains("y")
                && x.contains("z")){
            return true;
        }else{
            return false;
        }
    }
}

