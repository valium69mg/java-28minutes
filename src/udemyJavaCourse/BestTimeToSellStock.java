package udemyJavaCourse;

public class BestTimeToSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,1,5,3,6,4};
		System.out.println(bestTimeToSell(prices));
	}
	
	public static int bestTimeToSell(int[] prices) {
	// TWO POINTERS STRATEGY
		int startingPosition = 0;
		int p1 = startingPosition; // buy
		int p2 = startingPosition + 1; // sell
		int maxProfit = 0;
		int profit = 0;
		while (p2 < prices.length) {
			// profit?
			if (prices[p1] < prices[p2]) {
				profit = prices[p2] - prices[p1];
				if (profit > maxProfit) { // found max profit we sell 
					maxProfit = profit;
				} 
			}
			else { // if not we move pointers to the lowest value
					p1 = p2;
			}
			p2++;
		}
		
		return maxProfit;

	}

}
