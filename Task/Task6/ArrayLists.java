import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        // get element size
        System.out.println(list.size());


        // get element add
        list.add(0,100);
        System.out.println(list);


        // remove element
        list.remove(2);
        System.out.println(list);

        //clear all elemnts
        list.clear();
        System.out.println(list);

    }
}
