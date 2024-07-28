/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int max_profit= 0;
        //l: buy time, r:sell time，the profit: Δh on the y-axis
        int l=0, r=0; 
        while(r <prices.length){
            //if profitable
            if( prices[l]< prices[r] ){
                int profit = prices[r]-prices[l];
                max_profit= Math.max(max_profit,profit);
            }
            //else, the price shows an decreasing trend, bad time to sell, good time to update the lowest price(buy time)
            else{
                l=r;//update the l to a 
            }
            //either case increment the r
            r++;
        }
        return max_profit;
    }
}
//低买高卖，try buying at the lowest price,  the lowest price doenst mean the highest profit tho=> [3,9,1,2]
// that doesnt matter, bc the max_profit is updated with max
// @lc code=end

