/*
 * @lc app=leetcode.cn id=28 lang=java
 * @lcpr version=30201
 *
 * [28] 找出字符串中第一个匹配项的下标
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        int l1 = haystack.length();
        int l2 = needle.length();
        for(int i = 0; i < haystack.length(); i++){
            if(i + l2 > l1){
                return -1;
            }
            boolean matched = true;

            for(int j = needle.length() - 1; j >=0; j--){
                if(needle.charAt(j) != haystack.charAt(i + j)){
                    matched = false;
                    break;
                }
            }
            if(matched){
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "sadbutsad"\n"sad"\n
// @lcpr case=end

// @lcpr case=start
// "leetcode"\n"leeto"\n
// @lcpr case=end

 */

