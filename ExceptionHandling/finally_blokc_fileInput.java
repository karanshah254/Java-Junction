import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class finally_blokc_fileInput {
    public static void main(String[] args) throws IOException {
        FileInputStream file = null;
        try {
            file = new FileInputStream("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        } finally {
            if (file != null) {
                file.close();
            }
            System.out.println("File closed");
        }
    }
}