package dataStructures.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDsa {
    public static void main(String[] args) {
        // Creating a LinkedHashSet
        LinkedHashSet<String> animals = new LinkedHashSet<>();

        // Adding elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.add("Dog");  // Duplicate, will not be added

        // Displaying the LinkedHashSet
        System.out.println("LinkedHashSet: " + animals);

        // Checking if an element exists
        System.out.println("Contains Cat? " + animals.contains("Cat"));

        // Removing an element
        animals.remove("Horse");
        System.out.println("After removing Horse: " + animals);

        // Iterating using iterator
        System.out.println("Iterating over LinkedHashSet:");
        Iterator<String> iterator = animals.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Checking size
        System.out.println("Size of LinkedHashSet: " + animals.size());

        // Cloning
        LinkedHashSet<String> clonedSet = (LinkedHashSet<String>) animals.clone();
        System.out.println("Cloned LinkedHashSet: " + clonedSet);

        // Clearing all elements
        animals.clear();
        System.out.println("Is LinkedHashSet empty? " + animals.isEmpty());
    }
}
