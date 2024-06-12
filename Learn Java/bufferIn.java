import java.io.*;

public class bufferIn {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("enter your is name ");
        String name = a.readLine();
        System.out.println("yorur name is "+name);

        System.out.println("enter your age ");
        int age= Integer.parseInt(a.readLine());
        System.out.println(2*age);

 
    }
}
