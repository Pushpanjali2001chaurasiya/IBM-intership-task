
class students{
    // String name;
    // String roll;
    // int marks;


// String name="peehu";
// String roll="1";
// int mark = 19;
// String email ="p@gmail.com";

String name = "";
int id;
String email;
//method define..
public void display(){
    System.out.println(name + " "+ id +" "+ email);
}

}
public class classes {
    public static void main(String[] args) {
         //students s1 = new students();
        //System.out.println("peehu");
        //int a, b, c;

        
        // students a1 = new students();
        //     a1.name ="peehu";
        //     a1.id=1;
        //     a1.email="P@gmial.com";
        //     a1.display();


            //.........multipal entry......
            students a1 = new students();
            students a2 = new students();
            students a3 = new students();
            students a4 = new students();
            students a5 = new students();

            a1.name ="peehu";
            a1.id=1;
            a1.email="P@gmial.com";

            a2.name ="pushpa";
            a2.id=3;
            a2.email="c@gmial.com";

            a3.name ="pishpa";
            a3.id=4;
            a3.email="y@gmial.com";

            a4.name ="ppshpa";
            a4.id=2;
            a4.email="r@gmial.com";


            a5.name ="pppp";
            a5.id=5;
            a5.email="c@gmial.com";

            a2.name="abc";
            
            a1.display();
            a2.display();
            a3.display();
            a4.display();
            a5.display();

    }

}
