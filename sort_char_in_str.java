package javatraining;
import java.util.*;
public class sort_char_in_str {
	 public static void main(String[] args) {
	        String str = "dcbaez";

	        char[] arr = str.toCharArray();
	        Arrays.sort(arr);

	        String sorted = new String(arr);

	        System.out.println("Original: " + str);
	        System.out.println("Sorted: " + sorted);
	 }

}
