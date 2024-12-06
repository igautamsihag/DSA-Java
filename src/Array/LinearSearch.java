package Array;

public class LinearSearch {
	
	static void swap(int[] arr, int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	static int search(int[] arr, int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				swap(arr, i, 0);
				return i;
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {


		int[] arr = {2,4,5,8,1,10,17,4,3,9};
		System.out.println(search(arr, 3));
		
		for(int i=0;i<arr.length;i++) {
        	System.out.println(arr[i]);
        }

	}

}
