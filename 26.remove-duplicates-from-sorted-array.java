/*
 * @lc app=leetcode.cn id=26 lang=java
 * @lcpr version=30201
 *
 * [26] 删除有序数组中的重复项
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length < 1){
            return 0;
        }
        int k = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[k-1]){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,1,2]\n
// @lcpr case=end

// @lcpr case=start
// [0,0,1,1,1,2,2,3,3,4]\n
// @lcpr case=end

 */

