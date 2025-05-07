package dataStructures.map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDsa {
    public static void main(String[] args) {
        // Create Hashtable
        Hashtable<Integer, String> employees = new Hashtable<>();

        // Add entries
        employees.put(1001, "Alice");
        employees.put(1002, "Bob");
        employees.put(1003, "Charlie");

        // Display entries
        System.out.println("Employee List:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Access using key
        System.out.println("\nEmployee with ID 1002: " + employees.get(1002));

        // Check key/value
        System.out.println("Contains key 1003? " + employees.containsKey(1003));
        System.out.println("Contains value 'David'? " + employees.containsValue("David"));

        // Enumerate keys
        System.out.println("\nKeys:");
        Enumeration<Integer> keys = employees.keys();
        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement());
        }

        // Enumerate values
        System.out.println("\nValues:");
        Enumeration<String> values = employees.elements();
        while (values.hasMoreElements()) {
            System.out.println(values.nextElement());
        }

        // Use putIfAbsent
        employees.putIfAbsent(1004, "David");

        // Remove an entry
        employees.remove(1001);

        // Clone the hashtable
        Hashtable<Integer, String> copy = (Hashtable<Integer, String>) employees.clone();

        // Display cloned table
        System.out.println("\nCloned Employee List:");
        for (Map.Entry<Integer, String> entry : copy.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Clear original
        employees.clear();
        System.out.println("\nOriginal cleared. Is empty? " + employees.isEmpty());
    }
}
