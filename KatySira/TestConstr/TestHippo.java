package KatySira.TestConstr;

public class TestHippo {
    public static void main(String[] args) {
        System.out.println("Початок");
        Hippo hippo = new Hippo("Леся");
        System.out.println("Гіпопотама звати " + hippo.getName());
        Rabbit rabbit = new Rabbit("Жужа");
        System.out.println("Кролика звати " + rabbit.getName());
    }
}
