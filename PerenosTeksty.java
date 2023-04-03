import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class PerenosTeksty {
    public static void main(String[] args) {
        String fileIn = "D:\\Projects\\test1.txt";
        String fileOut = "D:\\Projects\\test2.txt";
        try(var inputStream = Files.newInputStream(Paths.get(fileIn));
            var outputStream = Files.newOutputStream(Paths.get(fileOut))){
            byte[] bytesIn = inputStream.readAllBytes();
            byte[] bytesOut = new byte[bytesIn.length];

            for(int i =0;i< bytesIn.length;i++){


                bytesOut[i] = bytesIn[i];

            }outputStream.write(bytesOut);


        }catch (IOException e ){
            System.out.println("Somth wrong " + e);
        }
    }
}