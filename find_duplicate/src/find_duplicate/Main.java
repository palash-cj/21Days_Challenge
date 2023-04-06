/*
 * Problem Statement: Find the Duplicate Number
 * Time Complexity:O(N)
 * Space Complexity:O(1)
 * Level:Medium
 */


package find_duplicate;

public class Main {
	public static int findDuplicate(int[] arr) {
		int slow=arr[0];
		int fast=arr[0];
		
		do{
			slow=arr[slow];
			fast=arr[arr[fast]];
		}while(slow!=fast);
		fast=arr[0];
		while(fast!=slow) {
			slow=arr[slow];
			fast=arr[fast];
		}
		return slow;
	}
	public static void main(String args[]) {
		int[] arr= {1,2,5,4,3,6,2};
		System.out.println(findDuplicate(arr));
	}
}
