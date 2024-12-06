package Array;

public class SumRecursion {

	static int sum(int[] arr, int n) {
		if(n<0) {
			return 0;
			
		}else {
			return sum(arr,n-1)+arr[n];
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 2;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}

		System.out.printf("\n%d", sum(arr, arr.length-1));

	}

}
