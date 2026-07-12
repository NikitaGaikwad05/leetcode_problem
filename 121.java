//Best Time To Buy and Sell Stock
/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/
//TimeComplexity: O(n)
//SpaceComplexity : O(1)
class Solution {
    public int maxProfit(int[] prices) {
      // Initialize the minimum price to a large number
        int minprice=Integer.MAX_VALUE;
       // Initialize the maximum profit to 0
        int maxprofit=0;
      // Traverse each price in the array
        for(int price:prices){
          // If current price is less than minPrice, update minPrice
            if(price<minprice){
                minprice=price;
            }
            // Else calculate profit and update maxProfit if it's greater
            else{
                maxprofit=Math.max(maxprofit,price-minprice);
            }
        }
        // Return the maximum profit found
          return maxprofit;
    }
}
