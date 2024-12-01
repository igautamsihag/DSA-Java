package Recursion;

public class Power {

	static int pow(int m, int n) {
		if(n==0) {
			return 1;
		} else if(n%2==0){
			return pow(m*m, n/2);
		} else {
			return m*pow(m*m,(n-1)/2);
		}
	}
	
//	static int pow(int m, int n) {
//		if(n==0) {
//			return 1;
//		} else {
//			return pow(m,n-1)*m;
//		}
//	}
	
	public static void main(String[] args) {
		int result = pow(2,9);
		System.out.println(result);

	}

}
