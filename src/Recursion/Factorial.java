package Recursion;

public class Factorial {

	static int fun(int x) {
		if(x==0) {
			return 1;
		}
		return fun(x-1)*x;
	}
	

	public static void main(String[] args) {

		int x=5;
		System.out.println(fun(x));
	}

}


