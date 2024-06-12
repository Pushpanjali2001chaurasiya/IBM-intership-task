public class StringBulder {
 public static void main(String[] args) {
    
    StringBuilder sb = new StringBuilder("pihu");
   
   System.out.println(sb);

   //char at index 0
   System.out.println(sb.charAt(0));


   // set char at index 0
   


   sb.insert(0,"monty");
   System.out.println(sb);


   //delete the extra 'n'
   sb.delete(2,3);
   System.out.println(sb);


   // append, insert, delete, remove,
 }
}
