/*
 * Problem Statement: Given an array of intervals, merge all the overlapping intervals and return an array of non-overlapping intervals
 * Level: medium
 * Time Complexity : O(NLogN)+O(N)
 * Space Complexity: O(N)
 */

package overlapping_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static int[][] setIntervals(int[][] intervals){
		List<int[]> res=new ArrayList<>();
		Arrays.sort(intervals,(a,b)->a[0]-b[0]);
		if(intervals.length==0 || intervals==null) {
			return res.toArray(new int[0][]);
		}
		
		int start=intervals[0][0];
		int end=intervals[0][1];
		for(int i=0;i<intervals.length;i++) {
			if(intervals[i][0]<end) {
				end=Math.min(end,intervals[i][0]);
			}else {
				res.add(new int[][] {start,end});
				start=intervals[i][0];
				end=intervals[i][1];
			}
		}
		res.add(new int[][] {start,end});
		return res.toArray(new int[0][]);
	}
	
	public static void main(String args[]) {
		int[][] intervals= {{1,3},{2,2},{2,5}};;
		int[][] updatedIntervals=setIntervals(intervals);
	}
	

}
