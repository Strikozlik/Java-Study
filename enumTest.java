import java.util.Arrays;

public class enumTest {
    public enum Color{
        YELLOW,
        RED,
        GREEN,
        BLUE
    }

    public static void main(String[] args) {
        System.out.println(Color.RED.name());
        System.out.println(Color.RED.ordinal());
        for(Color c:Color.values()){
            System.out.println(c);
        }
        boolean isEqualsHimself = Color.RED.equals(Color.RED);
        boolean isEqualsToDiff = Color.RED.equals(Color.GREEN);
        System.out.println(isEqualsHimself);
        System.out.println(isEqualsToDiff);

        int hashOfRed = Color.RED.hashCode();
        int hashOfGreen = Color.GREEN.hashCode();
        System.out.println(hashOfRed);
        System.out.println(hashOfGreen);

        Color [] colors = Color.values();
        System.out.println(Arrays.toString(colors));

    }
}
