package KatySira;

public class Test {


    public static void main(String[] args) {
        double one =  123456789.134134;
        double two = 987654321.123456789;
        double three = 985152951.9841;
        String s = String.format(" Level %,.5f of  %,.2f last %,.3f",one,two,two);
        System.out.println(s);

    }
}


