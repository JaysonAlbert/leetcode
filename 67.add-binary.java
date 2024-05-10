/*
 * @lc app=leetcode.cn id=67 lang=java
 * @lcpr version=30201
 *
 * [67] 二进制求和
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        int sign = 0;
        int l1 = a.length();
        int l2 = b.length();
        int diff = Math.max(l1, l2) - Math.min(l1, l2);
        if(l1 > l2){
            b = "0".repeat(diff) + b;
        }else{
            a = "0".repeat(diff) + a;
        }

        int idx = 0;
        String res = "";
        while(idx <Math.max(l1, l2)){
            int s = addChar(a.charAt(a.length() - idx - 1), b.charAt(b.length() - idx - 1), sign);
            if(s >= 2){
                sign = 1;
                s = s - 2;
            }else{
                sign = 0;
            }
            res = (char)('0' + s) + res;
            idx++;
        }

        if(sign != 0){
            res = (char)('0' + sign) + res;
        }
        return res;
    }

    int addChar(char a, char b, int sign){
        return a - '0' + b - '0' + sign;
    }

}
// @lc code=end



/*
// @lcpr case=start
// "11"\n"1"\n
// @lcpr case=end

// @lcpr case=start
// "1010"\n"1011"\n
// @lcpr case=end

 */

