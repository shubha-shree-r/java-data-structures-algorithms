package dataStructures.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDsa {

    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> fruits = new HashSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");  // Duplicate, will not be added

        // Displaying the HashSet
        System.out.println("HashSet: " + fruits);

        // Checking if an element exists
        System.out.println("Contains Banana? " + fruits.contains("Banana"));

        // Removing an element
        fruits.remove("Orange");
        System.out.println("After removing Orange: " + fruits);

        // Iterating through elements
        System.out.println("Iterating through HashSet:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Checking size
        System.out.println("Size of HashSet: " + fruits.size());

        // Clearing the HashSet
        fruits.clear();
        System.out.println("Is HashSet empty? " + fruits.isEmpty());

        int initialCapacity = 16;

        // custom load factor
        float customLoadFactor = 0.75f;

        // create HashSet with custom initial capacity and load factor
        HashSet<String> customHashSet = new HashSet<>(initialCapacity, customLoadFactor);

        // add elements to the HashSet
        customHashSet.add("Element 1");
        customHashSet.add("Element 2");
        customHashSet.add("Element 3");
        customHashSet.add("Element 4");
        customHashSet.add("Element 5");


        // print the HashSet
        System.out.println("Custom HashSet: " + customHashSet);
    }
}
