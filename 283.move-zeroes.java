/*
 * @lc app=leetcode.cn id=283 lang=java
 * @lcpr version=30201
 *
 * [283] 移动零
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
     public void moveZeroes(int[] nums) {
        int i = 0, j = 1;
        while(i < nums.length - 1 && j < nums.length){
            while( i < nums.length - 1 && nums[i] != 0){
                i++;
            }
            while( j < nums.length && (j <= i || nums[j] == 0 )){
                j++;
            }
            if (j == nums.length ){
                break;
            }
            swap(nums, i, j);
        }
    }

    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [0,1,0,3,12]\n
// @lcpr case=end

// @lcpr case=start
// [0]\n
// @lcpr case=end

 */

