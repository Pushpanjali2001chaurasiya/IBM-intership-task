class class1 {
    public int addi(int a, int b){
        return a+b;

    }
}

public class class2 {
    public static void main(String[] args) {
        class1 a1 = new class1();
        int z = a1.addi(4, 6);
        System.out.println(z);
    }
 
    
}
