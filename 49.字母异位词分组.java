/*
 * @lc app=leetcode.cn id=49 lang=java
 *
 * [49] 字母异位词分组
 */

// @lc code=start
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s: strs){
            String sorted = sortChars(s);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }

    private String sortChars(String s){
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }
}
// @lc code=end

