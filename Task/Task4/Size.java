package adit;
import java.io.File;

public class Size {
    public static void main(String[] args) {
        // Provide the path to the file

        // Create a File object with the specified path
        File file = new File("deno.txt");

        // Check if the file exists
        if (file.exists()) {
            // Get the size of the file in bytes
            long fileSizeInBytes = file.length();

            // Convert bytes to kilobytes
            double fileSizeInKB = fileSizeInBytes / 1024.0;

            // Convert bytes to megabytes
            double fileSizeInMB = fileSizeInKB / 1024.0;

            // Display the file size in different units
            System.out.println("File Size: " + fileSizeInBytes + " bytes");
            System.out.println("File Size: " + fileSizeInKB + " KB");
            System.out.println("File Size: " + fileSizeInMB + " MB");
        } else {
            System.out.println("File does not exist.");
        }
    }
}
