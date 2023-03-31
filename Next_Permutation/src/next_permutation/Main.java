/*
 * Problem Statement: Given an array Arr[] of integers, rearrange the numbers of the given array into the lexicographically next greater permutation of numbers.
 * level: Medium
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */


package next_permutation;

public class Main {
	static int[] swap(int[] arr, int a, int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		return arr;
	}
	
	static int[] reverse(int[] arr, int a, int b) {
		while(a<b) {
			swap(arr,a++,b--);
		}
		return arr;
	}
	
	static int[] findNextPermutation(int[] arr) {
		int n=arr.length;
		int index=-1;// index for storing the breakpoint
		for(int i=n-2;i>=0;i--) {
			if(i>=0 && arr[i+1]>arr[i]) {
				index=i;
				break;
			}
		}
		if(index==-1) {// if in case array is sorted in descending order
			return reverse(arr,0,n-1);
		}
		for(int i=n-1;i>=index;i--) {
			if(arr[i]>arr[index]) {// finding the smallest element to the right side of breakpoint but just greater than arr[i]
				swap(arr,index,i);
				break;
			}
		}
		return reverse(arr,index+1,n-1);
	}
	
	public static void main(String args[]) {
		int[] arr=new int[] {2,1,5,4,3,0,0};
		int[] nextPermutation=findNextPermutation(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(nextPermutation[i]+" ");
		}
	}

}
