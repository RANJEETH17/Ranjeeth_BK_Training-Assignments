package javabasics;
import java.util.Scanner;

public class leftrotate {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of rotations: ");
        int r = sc.nextInt();

        // To handle cases where r > n
        r = r % n;

        // Temporary array to store first r elements
        int[] temp = new int[r];

        // Copy first r elements
        for (int i = 0; i < r; i++) {
            temp[i] = arr[i];
        }

        // Shift remaining elements to left
        for (int i = r; i < n; i++) {
            arr[i - r] = arr[i];
        }

        // Copy temp elements to end
        for (int i = 0; i < r; i++) {
            arr[n - r + i] = temp[i];
        }

        // Print result
        System.out.println("Array after left rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
