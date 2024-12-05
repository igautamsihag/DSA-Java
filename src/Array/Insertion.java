package Array;

import java.util.Scanner;

public class Insertion {

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
        
        if(length<size) {
        
        System.out.println("Enter the element to add in the array:");
		int x = sc.nextInt();
		
		System.out.println("Enter the index to put the element:");
		int index = sc.nextInt();
		
		for(int i=length;i>index;i--) {
			arr[i] = arr[i-1];
		}
		
		arr[index] = x;
		
		length++;
		
		
		for(int i=0;i<length;i++) {
        	System.out.println(arr[i]);
        }
		
		sc.close();
        }
	}

}
