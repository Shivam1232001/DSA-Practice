package Binary_Search;

import java.util.*;

public class TimeMap {
    private Map<String, TreeMap<Integer, String>> m;

    // Constructor
    public TimeMap() {
        m = new HashMap<>();
    }

    // Set key -> value at a timestamp
    public void set(String key, String value, int timestamp) {
        m.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp, value);
    }

    // Get value for key at given timestamp
    public String get(String key, int timestamp) {
        if (!m.containsKey(key)) return "";
        TreeMap<Integer, String> timestamps = m.get(key);
        Map.Entry<Integer, String> entry = timestamps.floorEntry(timestamp);
        return entry == null ? "" : entry.getValue();
    }

    // Main method for testing
    public static void main(String[] args) {
        TimeMap tm = new TimeMap();
        
        tm.set("foo", "bar", 1);
        System.out.println(tm.get("foo", 1)); // Output: bar
        System.out.println(tm.get("foo", 3)); // Output: bar (closest <= 3 is 1)

        tm.set("foo", "bar2", 4);
        System.out.println(tm.get("foo", 4)); // Output: bar2
        System.out.println(tm.get("foo", 5)); // Output: bar2 (closest <= 5 is 4)

        // Edge cases
        System.out.println(tm.get("foo", 0)); // Output: "" (no timestamp <= 0)
        System.out.println(tm.get("bar", 1)); // Output: "" (no such key)
    }
}
