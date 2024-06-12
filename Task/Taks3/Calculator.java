class Calc{
    int a;
    int b;

    //addition
    public static int addition(int a,int b){
        return a+b ;
    }
    //substract
    public static int substract(int a,int b){
        return a-b ;
    }
    //multiply
    public static int multiply(int a,int b){
        return a*b ;
    }
    //divide
    public static int divide(int a,int b){
        return a/b ;
    }
}
public class Calculator{
    public static void main(String args[]){
        // addition object 
        
        Calc add = new Calc();
        int s1 = add.addition(5,7);
        System.out.println(s1);

        // substract object 
        Calc sub = new Calc();
        int s2 = sub.substract(15,7);
        System.out.println(s2);
        
        // multiply object 

        Calc mul = new Calc();
        int s3 = mul.multiply(5,7);
        System.out.println(s3);

        // divide object 

        Calc div = new Calc();
        int s4 = div.divide(37,7);
        System.out.println(s4);
    }
}