/*
 * @lc app=leetcode.cn id=27 lang=java
 * @lcpr version=30201
 *
 * [27] 移除元素
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        int i = 0, j = nums.length - 1;
        while(i < j){
            while(nums[i] != val && i < j){
                i++;
            }
            while(nums[j] == val && i < j){
                j--;
            }

            swap(nums, i, j);
        }

        if(nums[j] == val){
            j--;
        }

        return j+1;
    }

    void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,2,2,3]\n3\n
// @lcpr case=end

// @lcpr case=start
// [0,1,2,2,3,0,4,2]\n2\n
// @lcpr case=end

 */

