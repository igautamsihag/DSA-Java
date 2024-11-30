package Recursion;

public class SumofN {

	static int sum(int x) {
		if(x<=0) {
			return 0;
		} else {
			return sum(x-1)+x;
		}
	}
	public static void main(String[] args) {


		int x=5;
		System.out.println(sum(x));

	}

}
