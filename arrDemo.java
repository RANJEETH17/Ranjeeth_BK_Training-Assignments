package javatraining;
import java.util.*;

public class arrDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
 

        System.out.println("Enter Size:");
        int size = sc.nextInt();     
        

        int[] arr = new int[size];   
        
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter key:");
        int key=sc.nextInt();
        
        boolean found = false; 
        
        for(int i=0;i<=size;i++) {
        	if(arr[i]==key) {
        		System.out.println("element found at " + (i+1));
        		found=true;
        		break;
        	}
        		
        }

        if (!found) {
            System.out.println("element not found");
        }



       
    }
}
