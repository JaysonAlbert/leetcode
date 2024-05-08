/*
 * @lc app=leetcode.cn id=13 lang=java
 * @lcpr version=30201
 *
 * [13] 罗马数字转整数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {

    static Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
    }
    

    public int romanToInt(String s) {
        if(s == null || s.isEmpty()){
            return 0;
        }
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(i < s.length() -1 && map.get(c) < map.get(s.charAt(i + 1))){
                res -= map.get(c);
            }else{
                res += map.get(c);
            }
        }

        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "III"\n
// @lcpr case=end

// @lcpr case=start
// "IV"\n
// @lcpr case=end

// @lcpr case=start
// "IX"\n
// @lcpr case=end

// @lcpr case=start
// "LVIII"\n
// @lcpr case=end

// @lcpr case=start
// "MCMXCIV"\n
// @lcpr case=end

 */

