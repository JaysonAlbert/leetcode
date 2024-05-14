/*
 * @lc app=leetcode.cn id=136 lang=java
 * @lcpr version=30201
 *
 * [136] 只出现一次的数字
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        int a = 0;
        for(int i = 0; i<nums.length ; i++){
            a ^= nums[i];
        }
        return a;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,2,1]\n
// @lcpr case=end

// @lcpr case=start
// [4,1,2,1,2]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

 */

