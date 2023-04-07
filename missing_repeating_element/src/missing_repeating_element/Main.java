/*
 * Problem Statement: Fing the missing & repeating element from the given array
 * Time Complexity: O(N)+O(N)
 * Space Complexity; O(1)
 * Level: Medium
 */


package missing_repeating_element;

public class Main {
	public static int[] findElements(int[] arr) {
		int[] res=new int[2];
		int[] temp=new int[arr.length+1];
		for(int i=0;i<arr.length;i++) {
			temp[arr[i]]++;
		}
		for(int i=1;i<temp.length;i++) {
			if(temp[i]==0) {
				res[0]=i;
			}else if(temp[i]>1) {
				res[1]=i;
			}
		}
		return res;
	}
	public static void main(String args[]) {
		int[] arr= {1,2,2,3,4,5};
		int[] res=findElements(arr);
		System.out.println("Missing Element is "+res[0]);
		System.out.println("Duplicate Element is "+res[1]);
	}
}
