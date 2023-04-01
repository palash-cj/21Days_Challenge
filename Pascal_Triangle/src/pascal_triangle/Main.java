/*
 * Problem Statement: Pascal's triangle
 * Level: Hard
 * Time Complexity: O(N*N)
 * Space Complexity: O(N*N)
 */

package pascal_triangle;


public class Main {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> pre=new ArrayList<Integer>();
        for(int i=0;i<numRows;++i){
            List row=new ArrayList<Integer>();
            for(int j=0;j<=i;++j){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    row.add(pre.get(j-1)+pre.get(j));
                }
            }
            pre=row;
            result.add(row);
        }
        return result;
    }
	public static void main(String args[]) {
		int rows=5;
		List<List<Integer>> result=findPascalTriangle(rows);
		
	}
}
