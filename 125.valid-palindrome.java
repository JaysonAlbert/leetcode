/*
 * @lc app=leetcode.cn id=125 lang=java
 * @lcpr version=30201
 *
 * [125] 验证回文串
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int i = 0, j = s.length() - 1;
        while(i<=j){
            while(i <= j && !isAlphaNumber(s.charAt(i)) ){
                i++;
            }

            while( i <= j && j >=0 && !isAlphaNumber(s.charAt(j))){
                j--;
            }

            if(i <= j){
                if(s.charAt(i) != s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
        }

        return true;
    }

    private static boolean isAlphaNumber(char a){
        return a >= 'a' && a <= 'z' || a >= '0' && a <= '9';
    }
}
// @lc code=end



/*
// @lcpr case=start
// "A man, a plan, a canal: Panama"\n
// @lcpr case=end

// @lcpr case=start
// "race a car"\n
// @lcpr case=end

// @lcpr case=start
// " "\n
// @lcpr case=end

 */

