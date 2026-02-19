import java.io.*;

public class Mergefiles{
    public static void main(String[] args) {
        try {
            FileReader fr1 = new FileReader("sample.txt");
            FileReader fr2 = new FileReader("sample2.txt");
            FileWriter fw = new FileWriter("merged.txt");

            int ch;

            while ((ch = fr1.read()) != -1) {
                fw.write(ch);
            }

            while ((ch = fr2.read()) != -1) {
                fw.write(ch);
            }

            fr1.close();
            fr2.close();
            fw.close();

            System.out.println("Files merged successfully!");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
