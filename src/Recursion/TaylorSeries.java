package Recursion;

public class TaylorSeries {

	static double p=1,f=1;
	static double r;
	
	static double e(int x, int n) {
		
		
		if(n==0) {
			return 1;
		}else {
			r = e(x,n-1);
			p=p*x;
			f=f*n;
			return r+p/f;
		}
	}
	
	public static void main(String[] args) {

		System.out.println(e(4,15));

	}

}
