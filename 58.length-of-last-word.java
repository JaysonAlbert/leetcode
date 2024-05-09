/*
 * @lc app=leetcode.cn id=58 lang=java
 * @lcpr version=30201
 *
 * [58] 最后一个单词的长度
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null || s.equals("")){
            return 0;
        }
        int length = s.length();
        int i = length -1 ;
        while(s.charAt(i) == ' '){
            i--;
        }
        int tail = i;
        for(; i>=0 ; i --){
            if(s.charAt(i) == ' '){
                return tail - i ;
            }
        }

        return tail - i;

    }
}
// @lc code=end



/*
// @lcpr case=start
// "Hello World"\n
// @lcpr case=end

// @lcpr case=start
// "   fly me   to   the moon  "\n
// @lcpr case=end

// @lcpr case=start
// "luffy is still joyboy"\n
// @lcpr case=end

 */

