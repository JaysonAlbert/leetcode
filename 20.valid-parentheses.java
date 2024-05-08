/*
 * @lc app=leetcode.cn id=20 lang=java
 * @lcpr version=30201
 *
 * [20] 有效的括号
 */

// @lc code=start

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Solution {

    static Map<Character, Character> map = new HashMap<>();

    static {
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
    }


    public boolean isValid(String s) {
        if(s == null || s.isEmpty() || s.length() %2 != 0){
            return false;
        }

        LinkedList<Character> stack = new LinkedList<>();

        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                stack.addLast(s.charAt(i));
            }else{
                if(stack.isEmpty() || s.charAt(i) != map.get(stack.removeLast())){
                    return false;
                }
            }
        }

        if(!stack.isEmpty()){
            return false;
        }

        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "()"\n
// @lcpr case=end

// @lcpr case=start
// "()[]{}"\n
// @lcpr case=end

// @lcpr case=start
// "(]"\n
// @lcpr case=end

 */

