/*
 * Problem Statement: FInd majority element, provided an array find the elemnt which occurs more than half of length of array
 * Time Complexity:O(N)
 * Space Complexity:O(1)
 * Level: Hard
 */


package majority_element;

public class Main {
	public static int findMajorityElement(int[] arr) {
		int count=0;
		int el=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(count==0) {
				el=arr[i];
				count++;
			}else if(arr[i]==el) {
				count++;
			}else {
				count--;
			}
		}
		int count1=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==el) {
				count1++;
			}
		}
		if(count1>arr.length/2) return el;
		
		return -1;
	}
	public static void main(String args[]) {
		int[] arr= {1,2,3,4,1,1,1};
		System.out.println(findMajorityElement(arr));
	}
}
