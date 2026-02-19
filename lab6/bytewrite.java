import java.io.FileWriter;
import java.io.IOException;
public class bytewrite {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("sample.txt");
            fw.write("hello mouli!");
            fw.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}