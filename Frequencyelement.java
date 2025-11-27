package javabasics;
import java.util.*;
public class Frequencyelement {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        boolean[] visited = new boolean[n]; // to mark counted elements

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Frequency of each element:");
        for (int i = 0; i < n; i++) {

            if (visited[i] == true)
                continue;

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; // mark element as counted
                }
            }

            System.out.println(arr[i] + " = " + count);
        }
    }
}
