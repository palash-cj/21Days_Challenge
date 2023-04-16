/*
 * Problem Statement: Length of the longest subarray with zero Sum
 * Time Complexity: O(N^2)
 * Space Complexity:O(1)
 * Level:Medium
 */


package longest_subarray_with_sum;

public class Main {
	public static int maxLen(int[] arr)
    {
        int  max = 0;
    	for(int i = 0; i < arr.length; ++i){
    		int sum = 0;
    		for(int j = i; j < arr.length; ++j){
    			sum += arr[j];
    			if(sum == 0){
    				max = Math.max(max, j-i+1);
    			}
    		}
    	}
    	return max;
    }
	public static void main(String args[]) {
		int[] arr= {15,-2,2,-8,1,7,10,23};
		System.out.println(maxLen(arr));
	}

}
