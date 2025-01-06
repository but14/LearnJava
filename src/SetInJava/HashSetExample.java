package SetInJava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args){

        //Create Hashset
        HashSet<String> hashSet = new HashSet<>();

        // Add element HashSet
        hashSet.add("Long");
        hashSet.add("Quan");
        hashSet.add("Thinh");
        hashSet.add("Duong");

        // Remove
        hashSet.remove("Duong");

        System.out.println("HashSet: " + hashSet);

        // Add all element hashSet
        HashSet<String> newHashSet = new HashSet<>();
        newHashSet.addAll(hashSet);
        newHashSet.add("Phuc");
        newHashSet.add("Linh");

        //Remove element
        newHashSet.remove("Duong");
        System.out.println("New HashSet: " + newHashSet);

        //Iterator element
        // Calling iterator

        Iterator<String> iterator = hashSet.iterator();
        System.out.println("Iterator: ");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Lay phan hop
        newHashSet.addAll(hashSet);
        System.out.println("Hop: " + newHashSet);

        // Lay phan giao
        newHashSet.retainAll(hashSet);
        System.out.println("Phan giao: " + newHashSet);
    }
}
