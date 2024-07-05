import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
import java.util.Enumeration;

public class vect {
    
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("piyush");
        vector.add("pihu");
        vector.add("pushpa");
       vector.add(1,"trapti");
       System.out.println(vector);

       String firstElement=vector.firstElement();
       String lastElement=vector.lastElement();
       String elementatatindex=vector.get(2);

       System.out.println("phla elements  -"  +  firstElement);
       System.out.println("Akhiri elements - "  +  lastElement);
       System.out.println("Index wala Elements - "  +  elementatatindex);


        vector.remove("pushpa");
        System.out.println(vector);
        vector.remove(1);
        System.out.println(vector);


        vector.add("Trapti");
        vector.add("vaishu");
        

        
        Enumeration<String>enumeration=vector.elements();
        System.out.println("Elements using enumaeration");
        while(enumeration.hasMoreElements()){
        System.out.println(enumeration.nextElement());
        }


        Iterator<String> iterator = vector.iterator();
         System.out.println("After Iteration : ");
         while (iterator.hasNext()) {
            System.out.println(iterator.next());
         }


         ListIterator<String> listIterator = vector.listIterator();
         System.out.println("list interator ke bad elements");
         while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }


          boolean elementhai = vector.contains("rahul");
         System.out.println("vector me hain kya? -" + elementhai);

         int size = vector.size();
         System.out.println(size);

         Collections.sort(vector);
         System.out.println(vector);

         Vector<String> vectorcopy= new Vector<>(vector);
         System.out.println("copy wala vector"+vectorcopy);


        vector.clear();
        System.out.println("after all clear"+vector);


        }

    }

