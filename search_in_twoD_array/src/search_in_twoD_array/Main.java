package search_in_twoD_array;

public class Main {
	public static boolean findTarget(int[][] arr,int target) {
		int n=arr.length;
		int m= arr[0].length;
		int low=0;
		int high=(n*m)-1;
		while(low<=high) {
			int mid=(low+(high-low)/2);
			if(arr[mid/m][mid%m]==target) {
				return true;
			}else if(arr[mid/m][mid%m]<target) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return false;
	}
	public static void main(String args[]) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(findTarget(arr,6));;
	}
}
