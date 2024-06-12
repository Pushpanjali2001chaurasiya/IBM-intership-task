package adit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileWithBufferedReader {
    public static void main(String[] args) {
        // File path
        String filePath = "example.txt";
        
        try {
            // Create a BufferedReader object to read the file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            
            String line;
            
            // Read each line from the file until the end
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
            // Close the reader
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
