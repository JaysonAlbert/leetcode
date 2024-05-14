/*
 * @lc app=leetcode.cn id=121 lang=java
 * @lcpr version=30201
 *
 * [121] 买卖股票的最佳时机
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int minpricie = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i<prices.length ; i++){
            if(prices[i] < minpricie){
                minpricie = prices[i];
            }else if(profit < prices[i] - minpricie){
                profit = prices[i] - minpricie;
            }
        }
        return profit;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [7,1,5,3,6,4]\n
// @lcpr case=end

// @lcpr case=start
// [7,6,4,3,1]\n
// @lcpr case=end

 */

