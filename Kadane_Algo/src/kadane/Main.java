/*
 * Problem Statement: Kadane’s Algorithm / Maximum Subarray Sum in an Array
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 * Level: Medium
*/

package kadane;

public class Main {
	public static int maxSubarray(int[] arr) {
		int sum=0;
		int maxi=Integer.MIN_VALUE;
		int start=0;
		int end=0;
		for(int i=0;i<arr.length;i++) {
			if(sum==0) start=i;
			sum+=arr[i];
			
			if(maxi<sum) {
				maxi=sum;
				end=i;
			}
			
			if(sum<0) {
				sum=0;
			}
		}
		System.out.println("Max subaary starts from "+ start);
		System.out.println("Max subaary ends at "+ end);
		return maxi;
	}
	
	public static void main(String args[]) {
		int[] arr=new int[]{-1,2,-1,6,-5,3,-2};
		System.out.println(maxSubarray(arr));
	}
}
