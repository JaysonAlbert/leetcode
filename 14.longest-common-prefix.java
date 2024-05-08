/*
 * @lc app=leetcode.cn id=14 lang=java
 * @lcpr version=30201
 *
 * [14] 最长公共前缀
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length < 1){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }

        int prefixIdx = 0;
        int minLength = Integer.MAX_VALUE;
        for(int i = 0; i < strs.length; i ++){
            minLength = Math.min(minLength, strs[i].length());
        }
        if(minLength == 0){
            return "";
        }

        while(prefixIdx < minLength){
            char c = strs[0].charAt(prefixIdx);
            for(int i = 1; i< strs.length; i++){
                if(strs[i].charAt(prefixIdx) != c){
                    return strs[0].substring(0, prefixIdx);
                }
            }
            prefixIdx++;
        }

        return strs[0].substring(0, prefixIdx);
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["flower","flow","flight"]\n
// @lcpr case=end

// @lcpr case=start
// ["dog","racecar","car"]\n
// @lcpr case=end

 */

