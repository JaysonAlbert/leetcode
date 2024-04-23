/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */

// @lc code=start
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public List<String> letterCombinations(String digits) {

        char[] chars = digits.toCharArray();
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");map.put('3', "def");map.put('4', "ghi");
        map.put('5', "jkl");map.put('6', "mno");map.put('7', "pqrs");
        map.put('8', "tuv");map.put('9', "wxyz");

        if(chars.length == 0){
            return new ArrayList<>();
        }
        return sub(0, chars, map);
    }

    public List<String> sub(Integer index, char[] chars, Map<Character, String> map){
        if(index == chars.length -1){
            String str = map.get(chars[index]);
            List<String> s = new ArrayList<>();
            for(int i=0;i<str.length();i++){
                s.add(String.valueOf(str.charAt(i)));
            }
            return s;
        }

        List<String> s = sub(index + 1, chars, map);
        for(int i=0;i<s.size();i++){
            String str = map.get(chars[index]);
            for(int j=0;j<str.length();j++){
                s.set(i, s.get(i) + str.charAt(j));
            }
        }
        return s;
    }

}
// @lc code=end

