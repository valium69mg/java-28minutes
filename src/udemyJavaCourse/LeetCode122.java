package udemyJavaCourse;

public class LeetCode122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {7,1,5,3,6,4};
		int[] list2 = {1,2,3,4,5};
		int[] list3 = {7,6,4,3,1};
		System.out.println(maxProfit(list));
		System.out.println("================");
		System.out.println(maxProfit(list2));
		System.out.println("================");
		System.out.println(maxProfit(list3));

	}
	
	public static int maxProfit(int[] prices) {
		
		int profit = 0;
		int prevPrice = 0;
		int currPrice = 0;
		int nextPrice = 0;
		boolean buy = false;
		int boughtPrice = 0;
		for (int i = 0; i < prices.length;i++) {
			if (prices.length <= 1 || prices.length >= 30000) {
				return -1;
			}
			if (!buy) { // IF THERE IS NO STOCK BOUGHT
				// FIRST ITERATION
				if (i == 0) {
					currPrice = prices[i];
					nextPrice = prices[i+1];
					if (nextPrice > currPrice) { // IF TOMORROWS PRICE IS GRAETER WE BUY
						buy = true;
						boughtPrice = currPrice;
					} 
				} else if (i == (prices.length -1)) { 
					continue;
				} else {
					prevPrice = prices[i-1];
					currPrice = prices[i];
					nextPrice = prices[i+1];
					
					if (nextPrice > currPrice) {
						buy = true;
						boughtPrice = currPrice;
						System.out.println("Bought stock at: " + boughtPrice);
					}
				}
				
			} else { // IF THERE IS STOCK BOUGHT
				prevPrice = prices[i-1];
				currPrice = prices[i];
				
				if (i == (prices.length - 1)) { // LAST ITERATION
					if (nextPrice > prevPrice) {
						buy = false;
						profit += currPrice - boughtPrice; // TAKE PROFIT
						System.out.println("Selled stock at: " + currPrice);
						System.out.println("Current profit: " + profit);
					}
					continue;
				}
				
				nextPrice = prices[i+1];

				
				if (currPrice > nextPrice && currPrice > prevPrice) { // SELL IF WE TAKE MORE PROFIT TODAY THAN TUMORROW
					buy = false; // sell
					System.out.println("Selled stock at: " + currPrice);
					profit += currPrice - boughtPrice; // TAKE PROFIT
					System.out.println("Current profit: " + profit);
				}
				
				
			}
		}
		return profit;

	}
	
}
