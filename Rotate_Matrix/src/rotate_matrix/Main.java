/*
 * Problem statement: Given a matrix, your task is to rotate the matrix 90 degrees clockwise.
 * Level: Medium
 * Time Complexity: O(N*N)+ O(N*N)
 * Space Complexity: O(1)
 */

package rotate_matrix;

public class Main {
	static int[][] rotateMatrix(int[][] matrix){
		for(int i=0;i<matrix.length;i++) {
			for(int j=i;j<matrix.length;j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length/2;j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[i][matrix.length-1-j];
				matrix[i][matrix.length-1-j]=temp;
			}
		}
		return matrix;
	}
	public static void main(String args[]) {
		int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] rotatedMatrix=rotateMatrix(matrix);
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				System.out.print(rotatedMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
