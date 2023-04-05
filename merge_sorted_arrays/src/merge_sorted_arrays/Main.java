/*
 * Problem Statement: Merge two Sorted Arrays Without Extra Space
 * Time complexity:O(N+M)
 * Space Complexity:O(1)
 * Level:Medium
 */

package merge_sorted_arrays;

public class Main {
	
	public void merge(int[] A, int m, int[] B, int n) {
        for (int i = m+n-1, a = m-1, b = n-1; b>=0; i--) {
            if (a >= 0 && A[a] > B[b]) A[i] = A[a--]; 
            else A[i] = B[b--];
	    }
    }
	public static void main(String args[]) {
		int[] A= new int[6];
		A= {1,3,5};
		int[] B= {2,4,6};
		merge(A,B,3,3);
		
	}
}
