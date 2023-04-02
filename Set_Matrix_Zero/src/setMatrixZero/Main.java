/*
 * Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix
 * Level:Medium 
 * Time Complexity: O(N*M + N*M)
 * Space Complexity: O(N)
 */

package setMatrixZero;

public class Main {
	public static int[][] setZeroMatrix(int[][] matrix){
		int col0=1;
		int rows=matrix.length;
		int cols=matrix[0].length;
		for(int i=0;i<rows;i++) {
			if(matrix[i][0]==0) col0=0;
			for(int j=1;j<cols;j++) {
				if(matrix[i][j]==0) {
					matrix[i][0]=matrix[0][j]=0;
				}
			}
		}
		for(int i=rows-1;i>=0;i--) {
			for(int j=cols-1;j>=1;j--) {
				if(matrix[i][0]==0 || matrix[0][j]==0) {
					matrix[i][j]=0;
				}
				
			}
			if(col0==0) matrix[i][0]=0;
		}
		return matrix;
	}
	
	public static void main(String args[]) {
		int[][] matrix= {{1,0,1},{1,1,1},{0,0,1}};
		int[][] zeroMatrix=setZeroMatrix(matrix);
		for(int i=0;i<zeroMatrix.length;i++) {
			for(int j=0;j<zeroMatrix[0].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
