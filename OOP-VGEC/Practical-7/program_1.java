import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class program_1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Invalid");
            return;
        }

        String str = args[0];
        String file = args[1];

        try {
            File inputFile = new File(file);
            Scanner sc = new Scanner(inputFile);
            StringBuilder fileContent = new StringBuilder();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                fileContent.append(line).append(System.lineSeparator());
            }
            sc.close();

            String updatedContent = fileContent.toString().replaceAll(str, "");
            FileWriter writer = new FileWriter(inputFile);
            writer.write(updatedContent);
            writer.close();
            System.out.println("Occurrences of \"" + str + "\" removed from the file: " + file);
        } catch (FileNotFoundException e) {
            System.err.println("File not found " + file);
        } catch (IOException e) {
            System.err.println("Error occured while reading/writing file: " + e.getMessage());
        }
    }

}