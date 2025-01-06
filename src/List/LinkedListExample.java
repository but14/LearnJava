package List;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args){

        LinkedList<String> animals = new LinkedList<>();

        //Add
        animals.add("Dog");
        animals.add("Chicken");
        animals.add("Bird");
        animals.add("Cat");

        System.out.println(animals);

        LinkedList<String> manual = new LinkedList<>();

        //Add
        manual.add("Horse");
        manual.add("Fish");

        System.out.println(manual);
        //Add all of manual element in animal
        animals.addAll(manual);
        animals.add(2, "Bear");

        System.out.println(animals);

        // Creating an object of ListIterator
        ListIterator<String> ListIterator = animals.listIterator();

        ListIterator.add("Meo");

        System.out.println("Animal: " + animals);

        //Get element in LinkedList

        String a = animals.get(2);
        System.out.println("Get Animal: " + a);

        // Find element in LinkedList
        if (animals.contains("Lala")){
            System.out.println("Jack-KICM");
        }
        else {
            System.out.println("Thien Ly Oi");
        }

        //First Occurrence of Dog - Tim kiem vi tri phan tu
        int index = animals.indexOf("Dog");
        System.out.println("Index of Dog: "+index);

        //Change element in LinkedList
        animals.set(3, "Rabbit");

        System.out.println("Update Animal: " + animals);

        ListIterator.next();

        ListIterator.set("Zebra");

        System.out.println("New Animal: " + animals);

        // Remove Element in LinkedList
        animals.remove(1);
        System.out.println("Remove Animal: " + animals);

        animals.clear();

        System.out.println(animals);

        //Queue in LinkedList

        Deque<String> newanimals = new LinkedList<>();

        // Add first and last in Queue
        newanimals.addFirst("Meo");
        newanimals.add("Lala");
        newanimals.addLast("Jack");
        newanimals.add("KICM");

        System.out.println(newanimals);

        // Get element in Queue
        String name = newanimals.getFirst();
        System.out.println("Name: " + name);
        String namel = newanimals.getLast();
        System.out.println("Name: " + namel);
        //Peek - get element first
        System.out.println(newanimals.peek());

        //Hàm poll() trả về và loại bỏ phần tử đầu tiên trong LinkedList
        //Hàm offer() bổ sung thêm các phần tử cụ thể ở phần cuối của LinkedList
    }
}
