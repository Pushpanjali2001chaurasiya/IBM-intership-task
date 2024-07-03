import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Person {
    private String name;
    private int age;

    //constructor to initialize the peroperties
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//override the tostring method to retrun a string represntaion
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    
    public int getAge() {
        return age;
    }


}

public class main {
    public static void main(String[] args) {




        //create linkedList instance
        LinkedList<Person> list1 = new LinkedList<>();
        LinkedList<Person> list2 = new LinkedList<>();

        //  adding elements to list1

        list1.add(new Person("Anjali", 30));
        list1.add(new Person("Pushpanjali", 25));
        list1.add(new Person("Piyush", 35));

        // adding elements to list2
        list2.add(new Person("Trapti", 40));
        list2.add(new Person("Manorama", 28));
        list2.add(new Person("Annapurna", 33));

        // Displaying LinkedLists
        System.out.println("List1:");
        displayList(list1);
        System.out.println("List2:");
        displayList(list2);


        // Merging list2 into list1
        list1.addAll(list2);
        System.out.println("value of maerge list:"+list1);


        // Sort the merged LinkedList by age using a custom comparator
            Collections.sort(list1, new Comparator<Person>() {
             @Override
                public int compare(Person p1, Person p2) {
              return Integer.compare(p1.getAge(), p2.getAge());
                    }
                    });
                        System.out.println("Values of Sorted list : " + list1);

                System.out.println("----------------------------------------------------------");

                // Reverse the sorted LinkedList
                Collections.reverse(list1);
                System.out.println("Reverse the list : "+ list1);


        // Iterating through the LinkedList using an Iterator and printing each Person object
        System.out.println("Reversed and sorted merged list:");
        Iterator<Person> iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Checking for containment
        Person searchPerson = new Person("Anjali", 30);
        boolean contains = list1.contains(searchPerson);
        System.out.println("\nContains 'Anjali (30)': " + contains);

        // Removing elements based on condition
        list1.removeIf(person -> person.getAge() < 30);
        System.out.println("\nList after removing persons with age less than 30:");
        displayList(list1);

        // Converting to array
        Person[] personArray = list1.toArray(new Person[0]);
        System.out.println("\nArray of Persons:");
        for (Person person : personArray) {
            System.out.println(person);
        }

        // Clearing the LinkedList
        list1.clear();
        System.out.println("\nList after clearing:");
        displayList(list1);
    }

    private static void displayList(LinkedList<Person> list) {
        for (Person person : list) {
            System.out.println(person);
        }
    }
}
