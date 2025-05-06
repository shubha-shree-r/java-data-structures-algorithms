package dataStructures.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDsa {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding elements
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(10); // Duplicate, won't be added

        // Displaying the TreeSet (sorted order)
        System.out.println("TreeSet: " + numbers);

        // Basic methods
        System.out.println("Contains 15? " + numbers.contains(15));
        System.out.println("First element: " + numbers.first());
        System.out.println("Last element: " + numbers.last());
        System.out.println("Higher than 10: " + numbers.higher(10));
        System.out.println("Lower than 10: " + numbers.lower(10));

        // Subsets
        System.out.println("HeadSet (less than 15): " + numbers.headSet(15));
        System.out.println("TailSet (from 10): " + numbers.tailSet(10));
        System.out.println("SubSet (10 to 20): " + numbers.subSet(10, 20));

        // Iterating
        System.out.println("Ascending order:");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        System.out.println("Descending order:");
        Iterator<Integer> desc = numbers.descendingIterator();
        while (desc.hasNext()) {
            System.out.println(desc.next());
        }

        // Polling
        numbers.pollFirst();
        numbers.pollLast();
        System.out.println("After polling first and last: " + numbers);

        // Clearing
        numbers.clear();
        System.out.println("Is TreeSet empty? " + numbers.isEmpty());
    }

}
