package collections;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("Java");
        v.add("Selenium");
        v.add("Python");
        v.add("Testing");

        System.out.println("Vector elements: " + v);

        System.out.println("Element at index 1: " + v.get(1));

        v.remove("Python");

        System.out.println("Size of Vector: " + v.size());

        System.out.println("Iterating Vector:");
        for (String element : v) {
            System.out.println(element);
        }
    }
}
