import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("ABC.txt");
        for(int i = 0 ;i < 10; i++){
            fw.write("Hi! How Are You Buddy? \n");
        }
        fw.close();

        FileReader fr = new FileReader("ABC.txt");
        int k = fr.read();
        while (k != -1){
            System.out.print((char)k);
            k = fr.read();
        }
    }
}
