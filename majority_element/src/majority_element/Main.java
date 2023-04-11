/*
 * Problem Statement: Find the Majority Element that occurs more than N/2 times
 * Time Complexity: O(N) if  question gurantees to have majority element
 * Space Complexity: O(1)
 * Level:Hard
 */


package majority_element;

public class Main {
	public static int findMajorityElement(int[] arr) {
		int el=arr[0];
		int l=arr.length;
		int count=0;
		for(int i=0;i<l;i++) {
			if(count==0) {
				el=arr[i];
				count++;
			}else if(el==arr[i]) {
				count++;
			}else {
				count--;
			}
		}
		int cnt=0;
		for(int i=0;i<l;i++) {
			if(arr[i]==el) {
				cnt++;
			}
		}
		
		if(cnt>l/2) return el;
		
		return -1;
	}
	public static void main(String args[]) {
		int[] arr= {1,1,1,2,2,3,1};
		int majEl=findMajorityElement(arr);
		System.out.println(majEl);
	}
}
