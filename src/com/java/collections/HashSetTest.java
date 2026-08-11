package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    static void main() {
        HashSet<String> namesSet = new HashSet<>();
        namesSet.add("John");
        namesSet.add("Jane");
        namesSet.add("Bob");
        namesSet.add("Alice");
        namesSet.add("John");

        System.out.println(namesSet);
        System.out.println(namesSet.contains("madhu"));
        System.out.println(namesSet.isEmpty());
        System.out.println(namesSet.remove("madhu"));
        System.out.println(namesSet.size());

        //iterator
        Iterator<String> iterator = namesSet.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            name = name.toUpperCase();
            System.out.println(name);
        }
        System.out.println(namesSet);


    }
}
