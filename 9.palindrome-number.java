/*
 * @lc app=leetcode.cn id=9 lang=java
 * @lcpr version=30201
 *
 * [9] 回文数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        String s = String.valueOf(x);
        int half = s.length() / 2;
        LinkedList<Character> stack = new LinkedList<Character>();
        int i = 0;
        while(i < half){
            stack.addLast(s.charAt(i));
            i++;
        }

        if(s.length() % 2 != 0 ){
            i++;
        }

        while(i< s.length() && !stack.isEmpty()){
            if(s.charAt(i) != stack.removeLast()){
                return false;
            }
            i++;
        }

        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 121\n
// @lcpr case=end

// @lcpr case=start
// -121\n
// @lcpr case=end

// @lcpr case=start
// 10\n
// @lcpr case=end

 */

