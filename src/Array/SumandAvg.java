package Array;

public class SumandAvg {

	static int sum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	static double avg(int[] arr) {
		
		double avg = sum(arr)/arr.length;
		return avg;
		
	}
	public static void main(String[] args) {

		int[] arr = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+2;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d ",arr[i]); 
		}
		
		System.out.printf("\n%d",sum(arr)); 
		
		System.out.printf("\nThe average of this array is %.2f", avg(arr));
		

	}

}

