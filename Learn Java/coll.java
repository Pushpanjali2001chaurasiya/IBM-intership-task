import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class coll{
    public static void main(String[]args){

        ArrayList all=new ArrayList();
        System.out.println("all: " + all);

        // ArrayList all=new ArrayList();
        all.add(101);
        all.add(102);
        all.add(103);
        all.add(104);
        all.add(105);
        all.add(106);
        all.add(107);
        all.add(108);
        System.out.println("all: " + all);
        

        for (int i = 0; i<=all.size()-1; i++){
            System.out.println("index:- "+i+"value:-"+all.get(i));

System.out.println(".............................");


        }
            Iterator iterator = all.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next()+" ");
            }

    System.out.println(".............................");

        ListIterator listIterator = all.listIterator();
        while(iterator.hasNext()){
            System.out.println(listIterator.next()+" ");
        }
        
    System.out.println(".............................");


while (listIterator.hasPrevious()){
    System.out.println(listIterator.previous()+" ");
}

//creating clone of arrry

ArrayList ArrayListClone = (ArrayList)all.clone();
System.out.println("Original Arraylist:"+all);
System.out.println("Clone arraylist :"+ArrayListClone);
        }

    }
    

