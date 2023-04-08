/*
 * Problem Statement: Count the number of inversions in a given array
 * Time Complexity: O((N-1)^2)
 * Space Complexity:O(1)
 * Level:Medium
 */


package inversion_of_array;

public class Main {
	public static int countInversion(int []arr) {
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) count++;
			}
		}
		return count;
	}
	public static void main(String args[]) {
		int []arr= {5,4,3,1,2};
		int count=countInversion(arr);
		System.out.println(count);
	}

}
