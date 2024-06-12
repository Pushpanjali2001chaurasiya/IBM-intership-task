import java.util.Scanner;

public class uinput {

    public static void main(String[] args) {


//*****************bytee Datatype******************** */

        Scanner a = new Scanner(System.in);
        System.out.println("Enter you age");
        byte age = a.nextByte();
        System.out.println("your age is : "+age);


///****************long Datatype***********************/

 Scanner a = new Scanner(System.in);
 System.out.println("enter your height");
long phone = a.nextLong();

//*******************integer Datatype**************** */

int phone = a.nextInt();
System.out.println("your height is :"+phone);


//********************Float Datatype********************** */

float phone = a.nextFloat();
System.out.println("your height is :"+phone);

//***************byte Datatype */

byte age = a.nextByte();
System.out.println("your age is :"+age);


//*********************Boolean Datatype ***************** */

System.out.println("Do you have a laptop");
boolean laptop= a.nextBoolean();

//************************************ */
Scanner a = new Scanner(System.in);
System.out.println("enter number");

int num = a.nextInt();

System.out.println("table of "+num);

for(int i = 1; i<= 10; i++){
    System.out.println(num*i);
}


//*********************............Input  ........************ */

       java.util.Scanner a = new java.util.Scanner(System.in);
       Scanner a = new Scanner(System.in);
       System.out.println("enter your age: ");

        String name = a.nextLine();
        System.out.println("your name is pihu"+name);
        System.out.println("enter password");
        String pass = a.nextLine();
        System.out.println("your password is : "+pass);

          
        //*******************Comparision operator ************* */





        if(name.equals("pihu")||name.equals(null)){
            System.out.println("authrosied user");
    
        }else{
            System.out.println("logging out");
        }

        
        //*******************Comparision operator ************* */

        int age = a.nextInt();

        if(age>=18){
            System.out.println("you can vote");
        }else{
            System.out.println("you canot vote");
        }



    }

}