package Array;

import java.util.Scanner;

public class Append {

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
        
        System.out.println("Enter the element to add in the array:");
		int x = sc.nextInt();
        arr[length] = x;
        length++;
        
        for(int i=0;i<length;i++) {
        	System.out.println(arr[i]);
        }
        
        sc.close();
	}

}
