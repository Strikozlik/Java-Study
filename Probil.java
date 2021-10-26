public class Probil {
    public static void main(String[] args) {
        String s = "HelloJavaScrypt";
        System.out.println(camelCase(s));

    }

    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
}

