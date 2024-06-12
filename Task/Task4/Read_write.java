
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Read_write {
    public static void main(String[] args) throws IOException {
        // write in  file   
        FileWriter a = new FileWriter("demo.txt");
        a.write("My name is PC.\nI am from MAU\nI am ADIT Student");
        a.close();

        //  write in  file   
         FileReader read = new FileReader("demo.txt");
         Scanner sc = new Scanner(read);

         while(sc.hasNextLine()){
             System.out.println(sc.nextLine());
         }
    }
}
