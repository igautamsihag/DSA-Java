package Array;

import java.util.Scanner;

public class Deletion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		
		System.out.println("Enter the length of the array:");
		int length = sc.nextInt();
		
        sc.nextLine();
        
        int[]arr = new int[size];
        
        for(int i=0;i<length;i++) {
        	arr[i]=i+1;
        }

        for(int i=0;i<length;i++) {
        	System.out.println(arr[i]);
        }
        
        System.out.println("Enter the index of element to delete in the array:");
		int index = sc.nextInt();
        @SuppressWarnings("unused")
		int x = arr[index];
        
        for(int i=index;i<length-1;i++) {
        	arr[i] = arr[i+1];
        }
        
        length--;
        
        for(int i=0;i<length;i++) {
        	System.out.println(arr[i]);
        }
        
        sc.close();

	}

}
