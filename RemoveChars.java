public class RemoveChars {
    public static void main(String[] args) {
        String str = "Який сьогодні гарний день";
        System.out.println(remove(str));
    }
    public static String remove(String str) {
        StringBuilder builder = new StringBuilder(str);
        builder.deleteCharAt(0);
        builder.deleteCharAt(str.length()-2);
        return builder.toString();
    }
}
/*public class RemoveChars {
    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }
}*/