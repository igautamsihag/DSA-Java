package Array;

public class Merge {
	
	static int[] merge(int[] a, int[] b, int[]c) {
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				k++;
				i++;
			} else {
				c[k]=b[j];
				k++;
				j++;
			}
		}
		
		for(;i<a.length;i++) {
			c[k]=a[i];
			k++;
		}
		for(;j<b.length;j++) {
			c[k]=b[j];
			k++;
		}
		return c;
	}

	public static void main(String[] args) {
		
		
		int[] a = {2,6,7,19,1};
		int[] b = {1,8,21,29,3};
		
		int[] c = new int[a.length+b.length];

		merge(a,b,c);
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}

}
