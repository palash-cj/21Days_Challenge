/*
 * Problem Statement: Given an array of integers, find the length of longest consecutive subarray
 * Time Complexity:O(NlonN)+O(N)
 * Space Complexity:O(1)
 * Level:medium
 */


package longest_consecutive_subsequence;

import java.util.Arrays;

public class Main {
	public static int findSebsequence(int[] arr) {
		int l=arr.length;
		int max=1;
		int count=1;
		Arrays.sort(arr);
		for(int i=0;i<l-1;i++) {
			if(arr[i+1]-1==arr[i]) {
				count++;
				max=Math.max(max, count);
			}else if(arr[i+1]==arr[i]) {
				continue;
			}else {
				count=1;
			}
		}
		
		return Math.max(max, count);
	}
	public static void main(String args[]) {
		int[] arr= {0,2,1,4,3,7,9};
		System.out.println(findSebsequence(arr));
	}
}
