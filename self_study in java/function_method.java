import java.util.Scanner;

public class function_method {
    // public static void printMyName(String name) { //function name printmyname
    //     System.out.println(name);
    //     return;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String name = sc.next();

    //     printMyName(name);//call kiya function ko

    //}



    //**************************************** */


// public static int calculateSum (int a, int b) {
//     int sum = a + b;
//     return sum;   
// }
//  public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();

//     int sum = calculateSum(a, b);
//     System.out.println("sum of 2 number is :"+sum);
//  }


 //************************************************** */


//  public static int calculateProduct (int c, int d) {
//     return c*d;   
// }

//  public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int c = sc.nextInt();
//     int d = sc.nextInt();

//     System.out.println("Product of 2 number is :+"+calculateProduct(c, d));
    
//  }


//  ********************Find the factorial of a number*******************************/


public static void printFactorial (int n) {
        //loop
        int factorial = 1;

        for (int i =n; i>=1; i--) {
            factorial= factorial*i;

        }
        System.out.println(factorial);
        return;
    }
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        printFactorial(n);
}
}
