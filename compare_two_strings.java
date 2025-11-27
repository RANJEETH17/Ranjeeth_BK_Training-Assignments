package javatraining;

public class compare_two_strings {
public static void main(String[] args) {
        
        String s1 = "Apple";
        String s2 = "apple";

        // equals
        System.out.println("equals(): " + s1.equals(s2)); 
        System.out.println("equalsIgnoreCase(): " + s1.equalsIgnoreCase(s2)); 

        // compareTo
        System.out.println("compareTo(): " + s1.compareTo(s2)); 
    }
	
	

}
