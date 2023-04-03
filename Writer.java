import java.io.FileWriter;

public class Writer {
    public static void main(String[] args) throws Exception{
        int k1 = 0;
        int k2 = 9;
        newFile(k1,k2);


    }public static void newFile(int k1,int k2) throws Exception{
        FileWriter fw = new FileWriter("testWriter.txt");
        for(int i =k1;i<=k2;i++){
            fw.write(i+"\n");

        }fw.close();
    }
}
