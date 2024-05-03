import java.io.*;
import java.util.*;

public class program_3 {
    public static void main(String[] args) {
        File file = new File("Practical7.txt");

        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File 'Practical7.txt' created.");
            } catch (IOException e) {
                System.err.println("Error creating file: " + e.getMessage());
                return;
            }
        }

        try {
            FileWriter writer = new FileWriter(file);
            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                int num = random.nextInt(100);
                writer.write(num + " ");
            }
            writer.close();
            System.out.println("Random integers written to the file.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            return;
        }

        try {
            FileReader reader = new FileReader(file);
            Scanner scanner = new Scanner(reader);
            List<Integer> numbers = new ArrayList<>();
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }

            reader.close();
            scanner.close();
            Collections.sort(numbers);
            System.out.println("Numbers in increasing order:");

            for (int num : numbers) {
                System.out.print(num + " ");
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}