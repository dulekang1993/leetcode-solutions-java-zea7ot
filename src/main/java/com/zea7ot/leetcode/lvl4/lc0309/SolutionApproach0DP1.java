/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 * 
 * Time Complexity:     O(N)
 * Space Complexity:    O(1)
 * 
 * References:
 *  https://www.youtube.com/watch?v=jNy8yM0NBdw
 */
package com.zea7ot.leetcode.lvl4.lc0309;

public class SolutionApproach0DP1 {
    public int maxProfit(int[] prices) {
        // sanity check
        if (prices == null || prices.length == 0)
            return 0;

        int held = -prices[0], sold = 0, cooledDown = 0;
        for (int price : prices) {
            int prevHeld = held, prevSold = sold, prevCooledDown = cooledDown;
            sold = prevHeld + price;
            held = Math.max(prevHeld, prevCooledDown - price);
            cooledDown = Math.max(prevSold, prevCooledDown);
        }

        return Math.max(sold, cooledDown);
    }
}