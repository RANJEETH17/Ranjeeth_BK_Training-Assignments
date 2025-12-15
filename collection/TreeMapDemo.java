package collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "Java");
        map.put(1, "Python");
        map.put(4, "Selenium");
        map.put(2, "Testing");

        System.out.println("TreeMap in Ascending Order:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nTreeMap in Descending Order:");
        for (Map.Entry<Integer, String> entry : map.descendingMap().entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
