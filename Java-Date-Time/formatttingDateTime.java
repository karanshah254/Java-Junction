import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class formatttingDateTime {
    public static void main(String[] args) {
        LocalDateTime oldFormat = LocalDateTime.now();
        System.out.println("Old formar is " + oldFormat);

        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");

        String formatted = oldFormat.format(myFormat);
        System.out.println("\nNew format is " + formatted);
    }
}