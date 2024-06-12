
import java.io.FileWriter;
import java.io.IOException;

public class Append {
    public static void main(String[] args) {
        // File path
        String filePath = "example.txt";
        
        // Text or string to append
        String textToAppend = "This text will be appended to the file.";
        
        try {
            FileWriter writer = new FileWriter(filePath, true);
            writer.write(textToAppend);
            writer.close();
            
            System.out.println("Text appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file: " + e.getMessage());
        }
    }
}
