package Recursion;
import java.util.*;

public class Practice {

	static int max(int[] arr) {

		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		

		
		for(int i=0;i<arr.length;i++) {
			arr[i] = i+2;
		}
	
		
		System.out.printf("Element max is: %d\n",max(arr));
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
		
		
		

	}

}
