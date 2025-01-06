package CompareArrayListvsLinked;

import java.util.ArrayList;
import java.util.LinkedList;

public class Compare {
    public static void main(String[] args){
        // create Array List
        ArrayList<String> arrayList = new ArrayList<>();
        // Add element in ArrayList
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("JS");
        arrayList.add("Dart");

        // Create LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Laravel");
        linkedList.add("Flask");
        linkedList.add("Spring");
        linkedList.add("NodeJs");
        linkedList.add("Flutter");

        System.out.println("Language: " + arrayList);
        System.out.println("Framework: " + linkedList);


    }
}
