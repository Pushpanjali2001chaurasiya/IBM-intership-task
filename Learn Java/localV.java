 
    class Student{
        int age = 31;
        String name ="Manu";
        public void show(){
            System.out.println(name + ":"+ age);
        }
    }
    
    public class localV {
        public static void main(String[] args) {
            String name = "peehu";
            Student s1 = new Student();
            // s1.name = "Peehu";
            // s1.name="monty";
            // s1.name="patner";
            Student s2 = new Student();
            Student s3 = new Student();
            Student s4 = new Student();
            Student s5 = new Student();
            s1.show();
            // s2.show();
            // s3.show();
            // s4.show();

        }
    }

