import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class program_2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileAnalyzer <filename>");
            return;
        }

        String filename = args[0];

        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }

            bufferedReader.close();

            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filename);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}