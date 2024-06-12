
class addi extends sub{
    
}

class addi{
    public int add(int a, int b){
        return a+b;

    }
} 



class sub{
    public int sub(int a, int b){
        return a -b;
    }
}




public class aap{
    public static void main(String[] args) {
        addi obj = new addi();
        int res = obj.add(2,4);
        System.out.println(res);

    }
}