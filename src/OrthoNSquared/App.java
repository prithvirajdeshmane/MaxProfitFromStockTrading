/**
 * @author Prithviraj Deshmane
 *
 * THIS IS NOT AN IDEAL SOLUTION BECAUSE : O(n^2) 
 * Problem statement: During yesterday's stock trading, Apple's stocks rose and fell 
 * all day. You are provided a list of all of these values in the form of an array. 
 * You are to determine the largest profit a person could have made if they bought 
 * the stock at the lowest value and sold at the highest possible value in the rest 
 * of the day yesterday. 
 * 
 * Constraints:
 * - Your solution has to be efficient
 * - Stocks must be bought before being sold
 * 
 * Solution: 
 * - We assume that there are at least 2 or more data points in the list provided
 * - This list is provided in a simple data structure such as an array. This solution 
 * should be simple enough to be adapted for other data structures as well 
 * - Here we compare every element in the array to every other proceeding value and hence,
 * the Time Complexity is O(n^2). THIS IS NOT AN IDEAL SOLUTION  
 * - We do not use any other data structure to keep track of these values, and hence the 
 * Space Complexity for the program is O(1).
 */

package OrthoNSquared;

public class App {
	
	public static void main(String[] args) {
		int[] stockPricesYesterday = new int[]{6, 11, 8, 5, 7, 12};
		
		int maxProfit = getMaxProfit(stockPricesYesterday);
		
		System.out.println("Max profit yesterday: " + maxProfit);
	}

	private static int getMaxProfit(int[] stockPricesYesterday) {
		int maxProfit = -999999;
	
		for (int i = 0; i < stockPricesYesterday.length; i++) {
		
			for (int j = i+1; j < stockPricesYesterday.length; j++) {
		
				int delta = stockPricesYesterday[j] - stockPricesYesterday[i];
				maxProfit = (maxProfit > delta) ? maxProfit : delta;
			
			}
		
		}
		
		return maxProfit;
	}
}
