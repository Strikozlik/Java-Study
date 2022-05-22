package KatySira;

public class XCopy {
    public static void main(String[] args) {
        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);
        int z = x.go(24);
        System.out.println(orig + " " + y);
        System.out.println(z);
    }
    int go(int arg){
        arg = arg*2;
        return arg;

    }
}
