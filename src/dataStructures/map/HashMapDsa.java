package dataStructures.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDsa {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);

        // Accessing a value
        System.out.println("Value for 'Banana': " + map.get("Banana"));

        // Check if a key exists
        if (map.containsKey("Apple")) {
            System.out.println("Apple is in the map.");
        }

        // Iterating over keys
        System.out.println("\nKeys:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // Iterating over values
        System.out.println("\nValues:");
        for (int value : map.values()) {
            System.out.println(value);
        }

        // Iterating over key-value pairs
        System.out.println("\nKey-Value pairs:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Removing an entry
        map.remove("Orange");

        // Size of the map
        System.out.println("\nSize of map: " + map.size());

        // Clear the map
        map.clear();
        System.out.println("Map cleared. Is empty? " + map.isEmpty());
    }
}
