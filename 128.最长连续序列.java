/*
 * @lc app=leetcode.cn id=128 lang=java
 *
 * [128] 最长连续序列
 */

// @lc code=start
import java.util.Map;
import java.util.HashMap;
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Integer max_len = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                Integer left = map.getOrDefault(nums[i]-1,0);
                Integer right = map.getOrDefault(nums[i]+1,0);
                Integer cur_len = left + right + 1;
                max_len = Math.max(cur_len, max_len);
                map.put(nums[i], cur_len);
            }
            
        }
        return max_len;
    }
}
// @lc code=end

