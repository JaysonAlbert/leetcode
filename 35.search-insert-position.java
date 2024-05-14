/*
 * @lc app=leetcode.cn id=35 lang=java
 * @lcpr version=30201
 *
 * [35] 搜索插入位置
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {

        int l = 0, r = nums.length - 1;
        while(l <= r ){
            int mid = (l + r ) / 2;
            if(target > nums[mid]){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }

        return l;

    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,3,5,6]\n5\n
// @lcpr case=end

// @lcpr case=start
// [1,3,5,6]\n2\n
// @lcpr case=end

// @lcpr case=start
// [1,3,5,6]\n7\n
// @lcpr case=end

 */

