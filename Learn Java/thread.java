
class threa1 extends Thread{
    public void display() {
        System.out.println("thread1");
    }
}

class thread2 extends Thread{
    public void run (){
        for(int i = 0; i<=5; i++){
            System.out.println("Thread2");

        }
    }
}




public class thread {
    public static void main(String[] args) {

        threa1 obj = new threa1();
        obj.display();

        thread2 obj1 = new thread2();
        obj1.run();

    }
}
