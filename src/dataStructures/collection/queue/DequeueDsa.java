package dataStructures.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueDsa {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Inserting elements
        deque.addFirst("A");
        deque.addLast("B");
        deque.offerFirst("C");
        deque.offerLast("D");

        System.out.println("Deque after additions: " + deque);

        // Accessing elements
        System.out.println("First Element (peek): " + deque.peekFirst());
        System.out.println("Last Element (peek): " + deque.peekLast());

        // Removing elements
        System.out.println("Removed First: " + deque.pollFirst());
        System.out.println("Removed Last: " + deque.pollLast());

        System.out.println("Deque after removals: " + deque);

        // Utility methods
        System.out.println("Contains B? " + deque.contains("B"));
        System.out.println("Size: " + deque.size());
        System.out.println("Is empty? " + deque.isEmpty());

        // Iterating
        System.out.print("Forward Iteration: ");
        for (String s : deque) {
            System.out.print(s + " ");
        }

        System.out.print("\nReverse Iteration: ");
        for (var it = deque.descendingIterator(); it.hasNext(); ) {
            System.out.print(it.next() + " ");
        }

        // Clear
        deque.clear();
        System.out.println("\nDeque after clear: " + deque);
    }
}
