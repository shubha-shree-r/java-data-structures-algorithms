package src.dataStructures.collection.list;

import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.addFirst("Mango");
        list.addLast("Orange");
        System.out.println("List after adding: " + list);

        // Accessing elements
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // Modifying
        list.set(1, "Blueberry");
        System.out.println("After set at index 1: " + list);

        // Removing
        list.removeFirst();
        list.removeLast();
        list.remove(1);
        System.out.println("After removals: " + list);

        // Other methods
        System.out.println("Contains 'Cherry'? " + list.contains("Cherry"));
        System.out.println("Index of 'Cherry': " + list.indexOf("Cherry"));
        System.out.println("Is empty? " + list.isEmpty());

        // Clearing the list
        list.clear();
        System.out.println("List after clear(): " + list);
    }
}
