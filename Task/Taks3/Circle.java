import java.util.Scanner;

public class Circle {
     public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius value "  );
        int radius = sc.nextInt();

       

        System.out.println("Area of Circle : " + (Math.PI*radius*radius));
     }
}
