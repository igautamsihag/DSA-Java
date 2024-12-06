package Array;

public class BinarySearchRecursion {

	static int search(int[] arr, int h, int l, int key) {

		if(l<=h) {
			int mid = (l+h)/2;
			if(key==arr[mid]) {
				return mid;
			}else if(key<arr[mid]) {
				return search(arr, mid-1, l, key);
			}else {
				return search(arr, h, mid+1, key);
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		for(int i=0;i<arr.length;i++) {
        	arr[i]=i+1;
        }
        
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]);
        }
        
        System.out.printf("\n%d", search(arr, arr.length-1, 0, 5));

	}

}
