package Array;

public class Reverse {

	static void reverse(int[] arr) {
		int temp,i,j;
		
		for(i=0,j=arr.length-1;i<j;i++,j--) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	
	public static void main(String[] args) {


		int [] a = {1,2,3,4,5,6,7,8,9};
//		int [] b = new int[9];
//		int index = 0;
//		
//		for(int i=a.length-1;i>=0;i--) {
//			b[index] = a[i];
//			index++;
//		}
//		
//		for(int i=0;i<b.length;i++) {
//        	System.out.println(b[i]);
//        }
//		
//		for(int i=0;i<b.length;i++) {
//			a[i]=b[i];
//		}
		
		System.out.println("The reversed array -");
		reverse(a);
		for(int i=0;i<a.length;i++) {
        	System.out.println(a[i]);
        }
	}

}
