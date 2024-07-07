import java.io.FileInputStream;
import java.io.FileNotFoundException;

class ReadWrite {
    void read() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("abc.txt");
    }
}

public class throws_checkedException {
    public static void main(String[] args) {
        ReadWrite rw = new ReadWrite();
        try {
            rw.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Program ended...");
    }
}