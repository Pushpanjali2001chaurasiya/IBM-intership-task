class Student{
   static String name;  //-----------static V--------//
    // String name;   //----------local V-------//
    public void show(){
        System.out.println(name);
    }
}

public class dirH1{
   public static void main(String[] args) {
    String name = "Man";
    Student s1= new Student();
    s1.name = "Manu";
  
    Student s2 = new Student();
    Student s3 = new Student();
    Student s4 = new Student();
    // s2.name ="Trapti";
    // s3.name ="Puspa";
    s4.name ="Sakshi";

    s1.show();
    // s2.show();
    // s3.show();
    // s4.show();H

   }
}