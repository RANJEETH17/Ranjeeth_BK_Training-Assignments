package javabasics;
import java.util.Scanner;
public class removeduplicate {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array without duplicates:");
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // check if element appeared before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // print only if not duplicate
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
