import java.io.FileInputStream;
import java.io.IOException;
public class byteraed {
public static void main(String[] args) {
try {
FileInputStream fis = new FileInputStream("sample.txt");
int i;
while((i = fis.read()) != -1) {
System.out.print((char)i);
}
fis.close();
} catch (IOException e) {
System.out.println(e);
}
}
}
