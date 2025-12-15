package collections;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Selenium");
        stack.push("Python");
        stack.push("Testing");

        System.out.println("Stack elements: " + stack);

        System.out.println("Top element (peek): " + stack.peek());

        System.out.println("Removed element (pop): " + stack.pop());

        System.out.println("Position of Java: " + stack.search("Java"));

        System.out.println("Is stack empty? " + stack.isEmpty());

        System.out.println("Iterating Stack:");
        for (String element : stack) {
            System.out.println(element);
        }
    }
}
