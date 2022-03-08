import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintStream;

public class PrintStreamstr {

        public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        public static java.io.PrintStream stream = new java.io.PrintStream(outputStream);

        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);
            printSomething(scanner.nextLine());
            String result = outputStream.toString();
            try (PrintStream stream = new PrintStream(outputStream)){
                StringBuilder builder = new StringBuilder(String.valueOf(stream));
                builder.reverse();
                String res = builder.toString();
                System.out.println(res);
            }
            System.out.println(result);
        }
        public static void printSomething(String str) {
            stream.print(str);
        }
    }

