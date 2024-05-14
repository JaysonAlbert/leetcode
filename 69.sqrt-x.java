/*
 * @lc app=leetcode.cn id=69 lang=java
 * @lcpr version=30201
 *
 * [69] x 的平方根 
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int mySqrt(int x) {
        int res = 0;
        long bit = 1 << 15;
        while (bit > 0){
            if((res + bit) * (res + bit) <= x){
                res+=bit;
            }
            bit >>= 1;
        }
        return (int)res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 4\n
// @lcpr case=end

// @lcpr case=start
// 8\n
// @lcpr case=end

 */

