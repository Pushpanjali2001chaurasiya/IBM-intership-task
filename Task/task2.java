
public class task2 {
    public static void main(String[] args) {
    int a = 5;
    int b = 10;

    System.out.println("Before Swap:");
    System.out.println("a = " + a);
    System.out.println("b = " + b);

    // Using temporary variable
    int temp = a;
    a = b;
    b = temp;

    System.out.println("After Swap:");
    System.out.println("a = " + a);
    System.out.println("b = " + b);

    //WAP to convert Integer numbers and Binary numbers in java.
    
    int number = 45;
    String binaryString = Integer.toBinaryString(number);
            
    System.out.println("Integer: " + number);
    System.out.println("Binary: " + binaryString);


    //WAP to Find Factorial of a Number in Java. 
    int c = 5; 
    long factorial = 1;

     for(int i = 1; i <= c; i++) {
    factorial *= i;
    }

    System.out.println("Factorial of " + c+ " is: " + factorial);



    //WAP to Calculate Simple Interest in Java. 

    int pricipal = 5000;
    int rate = 5;
    int year = 3;

    int SI = pricipal*rate*year/100;
    System.out.println(SI);




        }
    }
    





