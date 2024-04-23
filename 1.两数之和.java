/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i=0;i<nums.length;i++){
            int cur = nums[i];
            map.put(cur,i);
            if(map.containsKey(target - cur)){
                res[0] = i;
                res[1] = map.get(target-cur);
                return res;
            }
        }
        return null;
    }
}
// @lc code=end

