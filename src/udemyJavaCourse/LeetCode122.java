package udemyJavaCourse;

public class LeetCode122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {7,1,5,3,6,4};
		int[] list2 = {1,2,3,4,5};
		int[] list3 = {7,6,4,3,1};
		int[] list4 = {5,2,3,2,6,6,2,9,1,0,7,4,5,0};
		/*
		System.out.println(maxProfit(list));
		System.out.println("================");
		System.out.println(maxProfit(list2));
		System.out.println("================");
		System.out.println(maxProfit(list3));
		*/
		//System.out.println(ListToHashMap(list));
		//System.out.println(MaxProfitReloaded(list));
		System.out.println(MaxProfitReloaded(list4));
		System.out.println(MaxProfit2(list4));
		

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
	
	public static float MaxProfitReloaded(int[] prices) {
		float profit = 0;
		int tradeBlockedUntilDay = 0;
		for (int i = 0; i<prices.length; i++) {
			// pivot = i
			
			float currentMaxProfit = 0;
			float bestPivotProfit = 0;
			//System.out.println("Trade blocked until: " + tradeBlockedUntilDay);
			if (tradeBlockedUntilDay > i) {
				continue;
			}
			//System.out.println("Evaluating pivot: " + i);

			for (int j = 0; j < prices.length; j++) {
				if (j <= i) { // search only for numbers to the right of the pivot
					continue;
				}			

				if (prices[j] - prices[i] > 0) { // IF WE FOUND A PROFIT WITH CURRENT PIVOT	
					if (currentMaxProfit < (prices[j] - prices[i]) / (j-i)) { // IF THE PROFIT FOUND IS GRATER THAN THE CURRENT
						currentMaxProfit = (prices[j] - prices[i]) /(j-i);			
						tradeBlockedUntilDay = j;
						bestPivotProfit = (prices[j] - prices[i]);
						//System.out.println("Current max profit: " + currentMaxProfit);
						//System.out.println("Day to be analized: " + j);
						//System.out.println("Price at pivot day "+ i + ": $" + prices[i]);
						//System.out.println("Price at current day "+ j + ": $" + prices[j]);
						//System.out.println("Profit found at pivot: " + i + " with profit of: " + bestPivotProfit);
					}
				}
				
			}
			
			
			//System.out.println("==========================");
			profit = profit + bestPivotProfit;
			//System.out.println("Current profit: "+ profit);
		}

	
		return profit;

	}
	
	public static int MaxProfit2(int[] prices) {
        int max = 0;
        int start = prices[0];
        int len = prices.length;
        for(int i = 1;i<len; i++){
            if(start < prices[i]) max += prices[i] - start;
            start = prices[i];
        }
        return max;
    }
	
	
	 public static void Quicksort(int numeros[], int izq, int der)
	    {
	            /*Este metodo recibe un arreglo de numero, y dos enteros que referencian el primer valor
	            Y el ultimo*/
	        
	            //Se toma como pivote el primer valor
	            int pivote = numeros[izq];
	            
	            //Se definen los dos lados y un auxiliar
	            int i = izq; 
	            int j = der; 
	            int aux;
	           
	            while(i<j)
	            {
	               while (numeros[i] <= pivote && i < j) 
	                  i++;

	               while (numeros[j] > pivote) 
	                  j--;   

	               if (i<j) 
	               {                                     
	                   aux = numeros[i];                  
	                   numeros[i]= numeros[j];
	                   numeros[j]=aux;
	               }
	            }

	             numeros[izq] = numeros[j]; 
	             numeros[j] = pivote;

	             if (izq < j-1)
	                Quicksort(numeros,izq,j-1);

	             if (j+1 < der)
	                Quicksort(numeros,j+1,der);
	      }
	 
	 public static void ImprimirVector(int arreglo[])
	    {
	        for(int i = 0; i < arreglo.length; i++)
	        {
	            System.out.println(arreglo[i]);
	        }
	    }
}
