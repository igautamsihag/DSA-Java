package Array;

public class Minimum {

	static int minimum(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];

			}
		}
		return min;
	}

	public static void main(String[] args) {

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 2;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}

		System.out.printf("\n%d", minimum(arr));

	}

}
