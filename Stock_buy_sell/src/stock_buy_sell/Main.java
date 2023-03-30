/*
 * Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 * Level:Medium
 */

package stock_buy_sell;

public class Main {
	public static int maximumProfit(int[] prices) {
		int min=Integer.MAX_VALUE;
		int maxPro=0;
		for(int i=0;i<prices.length;i++) {
			maxPro=Math.max(maxPro, prices[i]-min);
			min=Math.min(min,prices[i]);
		}
		return maxPro;
	}
	
	public static void main(String args[]) {
		int[] prices=new int[] {15,10,5,30,45,20,25};
		System.out.println(maximumProfit(prices));
	}

}
