import java.io.*;

public class Append1 {
    public static void main(String[] args) throws IOException{
        FileWriter x = new FileWriter("new.txt");
        x.write("My name is PC.I am from MAU\n I am ADIT Student\n");
        x.append("Pratibha is my friend");
        x.close();

    }
}
