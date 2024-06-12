import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class file1H {
    public static void main(String[] args) {

                //------------------delete file-----------------------//


            File a= new File("topics.txt");

            if(a.exists()){
                a.delete();
                System.out.println("file deleted successfully");
            }else{
                System.out.println("file not found");
                
            }


                //-----------------read text in file-----------------//

        // try{
        //     File a = new File("abc.txt");
        //     Scanner b = new Scanner(a);
        //     // String data = b.nextLine();
        //     // System.out.println(data);
        //     while(b.hasNextLine()){
        //     String data = b.nextLine();
        //     System.out.println(data);
        //     }
        // }catch(Exception e){
        //     System.out.println("not found");
        // }

        
                //---------------write text in file----------------//

    //     try{
    //     FileWriter a =new FileWriter("abc.txt");
    //         a.write("written using java");
    //         a.close();

    // }catch(Exception e){
    //     System.out.println("file can not be written");
    // }


                //----------------find file details-----------------//

        // File a = new File("C:\\Users\\dell\\Desktop\\topics.txt");
        //     if(a.exists()){
        //         System.out.println("File name is: "+ a.getName());
        //         System.out.println("Path is: " +a.getAbsolutePath());
        //         System.out.println("Parent is: "+ a.getParent());
        //         System.out.println("File size is: "+a.length()+" bytes");
        //         System.out.println("File is readable: "+ a.canRead());
                // System.out.println("File is readable: "+ a.writeRead());
        //     }else{
        //         System.out.println("File not found");
        //     }


            //--------------created new file -----------//

    //     File a =new File("C:\\Users\\dell\\desktop\\abc.txt");
    //     // File a =new File("abc.txt");
    //    try{
    //     if(a.createNewFile())
    //     {
    //     // a.createNewFile();
    //     System.out.println("created successfully");
    //     }
    //     else{
    //         System.out.println("already exit");
    //     }
    //    }catch(Exception e){
    //     System.out.println("not created");
    //    }
    }
}
