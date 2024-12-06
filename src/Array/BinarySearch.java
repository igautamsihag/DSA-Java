package Array;

public class BinarySearch {
	
	static int search(int[] arr, int key) {
		int l = 0;
		int h = arr.length-1;
		int mid;
		while (l<=h) {
			mid = (l+h)/2;
			if(key==arr[mid]) {
				return mid;
			}else if(key<arr[mid]) {
				h=mid-1;
			}else {
				l=mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int[]arr = new int[5];
        
        for(int i=0;i<arr.length;i++) {
        	arr[i]=i+1;
        }
        
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]);
        }
        
    
        
        
        System.out.printf("\n%d",search(arr, 3));
	}
	
	

}
