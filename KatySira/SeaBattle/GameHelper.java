package KatySira.SeaBattle;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {
    public String getUserInput(String promt) {
        String inputline = null;
        System.out.println(promt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputline = is.readLine();
            if (inputline.length() == 0) return null;
        } catch (IIOException e) {
            System.out.println("IOException: " + e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputline;
    }
}
