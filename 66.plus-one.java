/*
 * @lc app=leetcode.cn id=66 lang=java
 * @lcpr version=30201
 *
 * [66] 加一
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int sign = 1;
        int i = digits.length - 1;
        while(sign == 1 && i >=0){
            digits[i] = digits[i]  + sign;
            if(digits[i] >= 10){
                digits[i] -= 10;
                sign = 1;
            }else{
                sign = 0;
            }
            i--;
        }
        if(sign == 1){
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            System.arraycopy(digits, 0, res, 1, digits.length);
            return res;
        }else{
            return digits;
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [4,3,2,1]\n
// @lcpr case=end

// @lcpr case=start
// [0]\n
// @lcpr case=end

 */

