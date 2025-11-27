package javabasics;
import java.util.Scanner;

public class frequencychar {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter a character to find frequency: ");
        char ch = sc.next().charAt(0);

        int count = 0;

        // Convert both to same case (optional)
        str = str.toLowerCase();
        ch = Character.toLowerCase(ch);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("Frequency of '" + ch + "' = " + count);
    }
}
