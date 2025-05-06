package dataStructures.collection.list;

import java.util.Stack;

public class StackPractice {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("Stack after pushes: " + stack);

        // Peek top element
        System.out.println("Top element (peek): " + stack.peek());

        // Pop an element
        String popped = stack.pop();
        System.out.println("Popped element: " + popped);
        System.out.println("Stack after pop: " + stack);

        // Search for an element (1-based index from top)
        System.out.println("Position of 'Apple': " + stack.search("Apple"));
        System.out.println("Position of 'Cherry': " + stack.search("Cherry")); // -1 (not found)

        // Check size and emptiness
        System.out.println("Size: " + stack.size());
        System.out.println("Is empty? " + stack.isEmpty());

        // Clear stack
        stack.clear();
        System.out.println("After clear: " + stack);
    }
}
