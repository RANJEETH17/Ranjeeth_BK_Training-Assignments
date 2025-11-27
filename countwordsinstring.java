package javabasics;
import java.util.Scanner;
public class countwordsinstring {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        // Remove extra spaces at start/end and split by one or more spaces
        String[] words = str.trim().split("\\s+");

        System.out.println("Number of words: " + words.length);
    }
}
