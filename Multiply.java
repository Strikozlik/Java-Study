public class Multiply {
    public static void main(String[] args) {
        int test = 250;
        System.out.println(multiply(test));


    }
    public static int multiply(int number){
        var multiplier = number.toString().replace(/\D+/g,"").length;

        var scorer = 0;
        for(scorer; scorer<multiplier; scorer++){
            var result = parseInt(number *= 5);
        }

        return result;

    private static void parseInt() {
    }