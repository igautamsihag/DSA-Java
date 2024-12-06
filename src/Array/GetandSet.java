package Array;

public class GetandSet {

	static int get(int[] arr, int index) {

		if (index >= 0 || index < arr.length) {
			return arr[index];
		} else {
			return -1;
		}

	}

	static void set(int[] arr, int index, int value) {

		if (index >= 0 || index < arr.length) {
			arr[index] = value;
		}

	}

	public static void main(String[] args) {

		int[] arr = { 2, 4, 9, 1, 7 };

		System.out.println(get(arr, 2));

		set(arr, 2, 15);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
