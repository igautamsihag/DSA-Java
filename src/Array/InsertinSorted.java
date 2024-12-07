package Array;

public class InsertinSorted {

	static void insert(int[] arr, int l, int key) {
		
		int i = l-1;
		while(key<arr[i]) {
			arr[i+1]=arr[i];
			i--;
		}
		arr[i+1]=key;
	}
	public static void main(String[] args) {
		
		int[] arr = new int[8];
		
		for(int i=0;i<6;i++) {
			arr[i] = i*3;
		}
		
		for(int i=0;i<6;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("The inserted element -");
		insert(arr,6,7);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
