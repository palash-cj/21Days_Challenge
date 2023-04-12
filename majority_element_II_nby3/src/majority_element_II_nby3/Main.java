/*
 * Problem Statement: Majority Elements(>N/3 times) | Find the elements that appears more than N/3 times in the array
 * Time Complexity:O(N)
 * Space Complexity:O(1)
 * Level:hard
 */




package majority_element_II_nby3;

public class Main {
	public static int[] findMajorityElement(int[] arr) {
		int c1=0;
		int c2=0;
		int num1=-1;
		int num2=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num1) {
				c1++;
			}else if(arr[i]==num2) {
				c2++;
			}else if(c1==0) {
				num1=arr[i];
				c1=1;
			}else if(c2==0) {
				num2=arr[i];
				c2=1;
			}else {
				c1--;
				c2--;
			}
		}
		int[] arr1=new int[2];
		int count1=0;
		int count2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num1) {
				count1++;
			}else if(arr[i]==num2) {
				count2++;
			}
		}
		if(count1>arr.length/3) arr1[0]=num1;
		if(count2>arr.length/3) arr[1]=num2;
		
		return arr1;
	}
	
	public static void main(String args[]) {
		int[] arr= {1,1,1,3,3,3};
		int [] arr1=findMajorityElement(arr);
		System.out.println(arr1[0]+" "+arr1[1]);
	}

}
