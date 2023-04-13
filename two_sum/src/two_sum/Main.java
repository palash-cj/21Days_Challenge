/*
 * Problem Statement: two sum problem
 * Time Complexity:O(nlogn) + O(n)
 * Space Complexity:O(1)
 * Level:Medium
 */


package two_sum;

public class Main {
	static boolean findtarget(int[] arr, int target) {
		int l=arr.length;
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j]				};
					arr[j]=temp;
			}
		}
		int i=0;
		int j=l-1;
		while(i<j) {
			if(arr[i]+arr[j]==target) {
				return true;
			}else if(arr[i]+arr[j]>target) {
				j--;
			}else {
				i++;
			}
		}
		return false;
	}
	public static void main(String args[]) {
		int[] arr= {2,1,4,3,5,10};
		System.out.println(findtarget(arr, 15));
	}

}
