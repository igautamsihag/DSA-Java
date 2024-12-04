package Recursion;

public class Iterative {
	
	static double s=1,num=1,den=1;
	static double e(int x, int n) {
		for(int i=1;i<=n;i++) {
			num*=x;
			den*=x;
			s+=num/den;
		}
		return s;
	}

	public static void main(String[] args) {


		System.out.println(e(4,15));

	}

}
