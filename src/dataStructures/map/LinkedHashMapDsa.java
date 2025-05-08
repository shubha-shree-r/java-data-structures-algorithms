package dataStructures.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDsa {
    public static void main(String[] args) {
        // Create a LinkedHashMap
        LinkedHashMap<String, Integer> marks = new LinkedHashMap<>();

        // Adding entries
        marks.put("Math", 90);
        marks.put("Science", 85);
        marks.put("English", 88);

        // Insertion order maintained
        System.out.println("Subjects and Marks:");
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Use getOrDefault
        int historyMarks = marks.getOrDefault("History", 0);
        System.out.println("\nHistory Marks (default): " + historyMarks);

        // Use putIfAbsent
        marks.putIfAbsent("Math", 95); // Will not replace existing value
        marks.putIfAbsent("History", 75); // Will insert this one

        // Use replace
        marks.replace("English", 89);

        // Display updated map
        System.out.println("\nUpdated Subjects and Marks:");
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Remove an entry
        marks.remove("Science");

        // Check if map contains a key
        if (marks.containsKey("Math")) {
            System.out.println("\nMath is present.");
        }

        // Clear the map
        marks.clear();
        System.out.println("Map cleared. Is it empty? " + marks.isEmpty());
    }
}
