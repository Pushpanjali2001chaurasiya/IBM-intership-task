import java.io.File;

public class fileH {
    public static void main(String[] args) {
        
    //     File a = new File("abc.txt");
        
    //     try{
    //         a.createNewFile();
    //         System.out.println("created Successfully");}

    //     catch(Exception e){
    //         System.out.println("file not created");
    // }

    //************************************ */
    File a = new File("C:\\Users\\akash\\OneDrive\\Desktop\\impt point.txt");
        
        try{
            if(a.createNewFile()){

            
            System.out.println("created Successfully");
        }
        else{
            System.out.println("file already exists");
        }
    
        }catch(Exception e){
                System.out.println("file not created");
      }
            }
        }                                                                                                               