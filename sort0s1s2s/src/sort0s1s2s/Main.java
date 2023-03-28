/*
 * Problem Statement: Sort an array of 0s, 1s and 2s OR Dutch National Flag Problem
 * Optimal Time Complexity : O(N)
 * Space Complexity : O(1)
 * Level: Medium
*/


package sort0s1s2s;

public class Main {
	public static int[] sort(int[] arr) {
		int length=arr.length;
		int start=0;
		int mid=0;
		int end=length-1;
		int temp;
		
		while(mid<=end) {
			switch(arr[mid]) {
			case 0:
				temp=arr[mid];
				arr[mid]=arr[start];
				arr[start]=temp;
				start++;
				mid++;
				break;
				
			case 1:
				mid++;
				break;
			
			case 2:
				temp=arr[mid];
				arr[mid]=arr[end];
				arr[end]=temp;
				end--;
				break;
			}
		}
		return arr;
		
	}
	
	public static void main(String args[]) {
		int[] arr= new int[]{2,1,0,0,0,2,2,2,1,1,1,0,2,1};
		int[] nums=sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
