/*
 * Problem Statement: Pow of x
 * Time Complexity: O(log n)
 * Space Complexity:O(1)
 * Level:medium
 */



package pow_of_x;

public class Main {
	public static double findpow(double x, int y) {
		double ans=1;
		int n=y;
		while(n>0) {
			if(n%2==1) {
				ans=ans*x;
				n=n-1;
			}else {
				x=x*x;
				n=n/2;
			}
		}
		return ans;
	}
	
	public static void main(String args[]) {
		double x=10;
		int y=2;
		
		double ans=findpow(x,y);
		System.out.println(ans);
	}
}
