/*
 * Problem statement: Given an array of N integers, your task is to find unique quads that add up to give a target value. In short, you need to return an array of all the unique quadruplets [arr[a], arr[b], arr[c], arr[d]] such that their sum is equal to a given target.
 * Time Complexity:o(NlogN)+O(n3)
 * Space Complexity:O(1)
 * Level:medium
 */


package four_sum;

import java.util.ArrayList;
import java.util.List;

public class Main {
	static void findQuad(int[] arr, int target) {
		int l=arr.length;
		Arrays.sort(arr);
		ArrayList<List<Integer>> res=new List<List<Integer>>();
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				int target1=target-(arr[i]=arr[j]);
				int start=j+1;
				int end=l-1;
				while(start<end) {
					if(arr[i]+arr[j]>target1) {
						end--;
					}else if(arr[i]+arr[j]<target1) {
						start++;
					}else {
						ArrayList<Integer> quad=new List<Integer>();
						quad.add(arr[start]);
						quad.add(arr[end]);
						quad.add(arr[i]);
						quad.add(arr[j]);
						res.add(quad);
					}
					while(start<end && arr[start]==quad.get(2)) ++start;
					while(start<end && arr[end]==quad.get(3)) --end;
				}
				while(j+1<l && arr[j+1]==arr[j]) ++j;
			}
			while(i+1<l && arr[i+1]==arr[i]) ++i;
		}
		
	}
	public static void main(String args[]) {
		int[] arr= {-2,2,0,0,-1,1};
		findQuad(arr,0);
	}

}
