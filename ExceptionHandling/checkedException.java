import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class checkedException {
    public static void main(String[] args) {
        // compile time exception : handled during compile time only
        // main() creates exception object which includes: 1. Name 2. Description 3. Stack trace(error line)
        
        try {
            FileInputStream file = new FileInputStream("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.toString()); // also use S.O.P(e) prints name, description
            // e.printStackTrace(); // prints whole exception object
            System.out.println(e.getMessage()); // prints only description
        }
        System.out.println("Program ended");
    }
}