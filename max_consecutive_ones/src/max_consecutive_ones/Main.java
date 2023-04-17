/*
 * Problem Statement: Given a binary array nums, return the maximum number of consecutive 1's in the array.
 * Time Complexity: O(N)
 * Space Complexity:O(1)
 * Level:Easy
 */


package max_consecutive_ones;

public class Main {
	public static int maxConsecutiveCount(int[] nums) {
		int max=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                max=Math.max(max,count);
            }else{
                
                count=0;
            }
        }
        return max;
	}
	public static void main(String args[]) {
		int[] arr= {1,1,0,1,1,1};
		System.out.println(maxConsecutiveCount(arr));
	}

}
