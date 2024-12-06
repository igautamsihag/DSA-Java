package Array;

public class Maximum {

	static int maximum(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];

			}
		}
		return max;
	}

	public static void main(String[] args) {

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 2;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}

		System.out.printf("\n%d", maximum(arr));

	}

}




