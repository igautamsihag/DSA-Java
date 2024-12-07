package Array;

public class isSorted {

	static boolean sorted(int[] arr, int n) {
		for(int i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {


		int[] arr = {1,2,3,5,4,6};
		
		if(!sorted(arr, arr.length)) {
			System.out.println("Array not sorted");
		}else {
			System.out.println("Array is sorted");
		}

	}

}
