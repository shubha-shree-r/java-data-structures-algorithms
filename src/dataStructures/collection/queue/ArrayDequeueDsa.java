package dataStructures.collection.queue;

import java.util.ArrayDeque;

public class ArrayDequeueDsa {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Adding elements
        deque.addFirst("Apple");
        deque.addLast("Banana");
        deque.offerFirst("Mango");
        deque.offerLast("Orange");

        // Display elements
        System.out.println("Deque: " + deque);

        // Peeking elements
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());

        // Removing elements
        System.out.println("Removed First: " + deque.removeFirst());
        System.out.println("Removed Last: " + deque.removeLast());

        // Check contains
        System.out.println("Contains Banana? " + deque.contains("Banana"));

        // Size and empty check
        System.out.println("Size: " + deque.size());
        System.out.println("Is empty? " + deque.isEmpty());

        // Final Deque state
        System.out.println("Final Deque: " + deque);

        // Clear
        deque.clear();
        System.out.println("Deque after clear: " + deque);
    }
}
