
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;



public class lili {
public static void main(String[] args) {
 LinkedList<String>LinkedList=new LinkedList<>();

 LinkedList.add("Banana");
 LinkedList.add("apple");
 LinkedList.add("Mango");
 LinkedList.add("Mangoes");


 System.out.println("Initial LindedList:-"+LinkedList);

//********************Create in list form****************************

 System.out.println("Iterating the list through iterator");

 Iterator<String> iterator= (Iterator<String>)LinkedList.iterator();

 while (iterator.hasNext()) {
    System.out.println(iterator.next());
    
 }

//********************add first & last element in list****************************


LinkedList.addFirst("Orange");
LinkedList.addLast("Pineapple");
System.out.println("Update linkdedlist:-"+LinkedList);

//********************show first deleted element in list****************************


String polledElement=LinkedList.pollFirst();//polled element means deleted elements
System.out.println("Polled Elements:-"+ polledElement);

System.out.println("Updated LinkdLink -"+LinkedList);

//********************Alphabatic order****************************

Collections.sort(LinkedList);
System.out.println("Sorted LinkedList :-"+LinkedList);



//customized sorting

Collections.sort(LinkedList,new Comparator<String>(){
    @Override
    public int compare(String s1, String s2){
        return s2.compareTo(s1);
    }

});
System.out.println("Rervse sorted LinkList:-"+LinkedList);

LinkedList.add("Apple");
LinkedList.add("mango");
System.out.println("after duplicacy-"+LinkedList);

LinkedList.remove(Collections.singleton("Cheery"));
System.out.println("After clear "+LinkedList);


LinkedList.clear();
System.out.println("after clear:"+LinkedList);

}
}
