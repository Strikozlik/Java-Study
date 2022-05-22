package KatySira.TestConstr;

public class Boo {
    public Boo(int i){};
    public Boo(String s){};
    public Boo(String s, int i){};
}

class SonOfBoo extends Boo{
    public SonOfBoo(int z ,int x,int y){
        super("Star", z);


    }
}

class TestBoo{
    public static void main(String[] args) {
        SonOfBoo sonOfBoo = new SonOfBoo(4,3,2);
        System.out.println(sonOfBoo.getClass());


    }
}
