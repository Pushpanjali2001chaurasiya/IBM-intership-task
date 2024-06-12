
import java.io.*;

public class Delete {
    public static void main(String[] args) {
        File adit = new File("adit.txt");

        if (adit.delete()) {
            System.out.println("File deleted successfully : " + adit.getName());
        } else {
            System.out.println("File not deleted : " + adit.getName());
        }

    }
}
