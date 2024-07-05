

import  java.util.Iterator;
import java.util.Stack;
import java.util.ListIterator;



public class stack1 {
    
    public static void main(String[] args) {
        
        Stack stack = new Stack();

        stack.push(101);
        stack.push("annapurna");

        System.out.println("2 nodes push karne ke bad"+stack);
        stack.push("piyush");
        stack.push(102);
        stack.push(-95.36f);

        // System.out.println(stack);
        // stack.pop();
        // System.out.println(stack);

        // stack.pop();
        // System.out.println(stack);


        // stack.pop();
        // System.out.println(stack);
        // stack.pop();
        // System.out.println(stack);
        // stack.pop();
        // System.out.println(stack);/


        System.out.println(stack);

        Iterator iterator=stack.iterator();
        System.out.println("Iterator use karne ke bad");
        while (iterator.hasNext()) {
            System.out.println(iterator.next()+" ");
        }
        
        ListIterator listIterator= stack.listIterator();
        System.out.println("\n list iterator use karne ke bad");
        while (iterator.hasNext()) {
            System.out.println(iterator.next()+" ");
        }
        System.out.println("Reverse order");

        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }


    }
}
