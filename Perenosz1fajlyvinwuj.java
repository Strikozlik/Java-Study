import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Perenosz1fajlyvinwuj {
    public static void main(String[] args) {
        String fileIn = "D:\\Projects\\test1.txt";
        String fileOut = "D:\\Projects\\test2.txt";
        try(var inputStream = Files.newInputStream(Paths.get(fileIn));
            var outputStream = Files.newOutputStream(Paths.get(fileOut))){
            byte[] bytesIn = inputStream.readAllBytes();
            byte[] bytesOut = new byte[bytesIn.length];

            for(int i =0;i< bytesIn.length;i+=2){
                if(i< bytesIn.length-1){
                    bytesOut[i] = bytesIn[i+1];
                    bytesOut[i+1] = bytesIn[i];
                }else{
                    bytesOut[i] = bytesIn[i];
                }


            }outputStream.write(bytesOut);

        }catch (IOException e ){
            System.out.println("Somth wrong " + e);
        }
    }
}
