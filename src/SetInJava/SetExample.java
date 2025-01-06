package SetInJava;

import java.util.*;

public class SetExample {
    public static void main(String[] args){
        Set<String> setA = new HashSet<>();

        // A element in Set
        setA.add("Long");
        setA.add("Quan");

        // Dung iterator duyet qua cac phan tu
        System.out.println(setA);

        System.out.println(setA.contains("Long"));

        //Remove in Set
        setA.remove("Long");

        System.out.println(setA);

        Set<String> setB = new HashSet<>();

        setB.addAll(setA);
        System.out.println("Set B: "+setB);

        int sizeSet = setB.size();

        System.out.print(sizeSet);

        setB.add("Thinh");
        setB.add("Long");
        System.out.println("\nSet B: "+setB);

        int sizeSet2 = setB.size();

        System.out.print(sizeSet2);

        // Chuyen Set thanh List

        ArrayList<String> list = new ArrayList<>();

        list.addAll(setB);

        System.out.print(list);


    }
}
