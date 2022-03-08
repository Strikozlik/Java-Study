import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class VuvedennjaNaEkran {
    public static void main(String[] args) {
        String src  = "D:\\Projects\\test1.txt";
        String out  = "D:\\Projects\\test2.txt";
        try(FileReader reader = new FileReader(src);
            FileWriter writer = new FileWriter(out)){
            char[] buffer = new char[65536];
            while (reader.ready()){
                int real = reader.read(buffer);

                writer.write(buffer,0,real);
            }
        }catch (IOException e){
            System.out.println("Somth wrong" + e);
        }

    }

}
