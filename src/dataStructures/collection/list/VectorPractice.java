package dataStructures.collection.list;

import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add(1, "Mango");
        System.out.println("After adding: " + fruits);

        // Accessing elements
        System.out.println("First: " + fruits.firstElement());
        System.out.println("Last: " + fruits.lastElement());
        System.out.println("Element at index 2: " + fruits.get(2));

        // Modifying
        fruits.set(0, "Pineapple");
        System.out.println("After set at index 0: " + fruits);

        // Removing
        fruits.remove(2); // removes by index
        fruits.remove("Banana"); // removes by value
        System.out.println("After removals: " + fruits);

        // Checking
        System.out.println("Contains 'Cherry'? " + fruits.contains("Cherry"));
        System.out.println("Index of 'Cherry': " + fruits.indexOf("Cherry"));
        System.out.println("Size: " + fruits.size());
        System.out.println("Capacity: " + fruits.capacity());

        // Cloning
        Vector<String> clone = (Vector<String>) fruits.clone();
        System.out.println("Cloned Vector: " + clone);

        // Clearing
        fruits.clear();
        System.out.println("After clear: " + fruits);
        System.out.println("Is empty? " + fruits.isEmpty());
    }
}
