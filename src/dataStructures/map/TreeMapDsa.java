package dataStructures.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDsa {
    public static void main(String[] args) {
        // Create TreeMap
        TreeMap<Integer, String> students = new TreeMap<>();

        // Add entries
        students.put(102, "Alice");
        students.put(101, "Bob");
        students.put(105, "Charlie");
        students.put(103, "David");

        // Display sorted by key
        System.out.println("Student List (sorted by ID):");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Specific operations
        System.out.println("\nFirst Key: " + students.firstKey());
        System.out.println("Last Key: " + students.lastKey());
        System.out.println("Higher Key than 102: " + students.higherKey(102));
        System.out.println("Lower Key than 103: " + students.lowerKey(103));
        System.out.println("Ceiling Key for 104: " + students.ceilingKey(104));
        System.out.println("Floor Key for 104: " + students.floorKey(104));

        // Sub Map Example
        System.out.println("\nSubMap (101 to 104):");
        for (Map.Entry<Integer, String> entry : students.subMap(101, 104).entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Descending Map
        System.out.println("\nDescending Order:");
        for (Map.Entry<Integer, String> entry : students.descendingMap().entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Remove an entry
        students.remove(102);

        // Check if key/value exists
        System.out.println("\nContains key 101? " + students.containsKey(101));
        System.out.println("Contains value 'David'? " + students.containsValue("David"));

        // Final size
        System.out.println("Size of TreeMap: " + students.size());

        // Clear the map
        students.clear();
        System.out.println("Is TreeMap empty now? " + students.isEmpty());
    }
}
