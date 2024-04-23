/*
 * @lc app=leetcode.cn id=76 lang=java
 *
 * [76] 最小覆盖子串
 */

// @lc code=start
import java.util.Map;
import java.util.HashMap;
class Solution {
    Map<Character, Integer> ori = new HashMap<>();
    Map<Character, Integer> cnt = new HashMap<>();

    public String minWindow(String s, String t) {
        int l=0,r=0;
        int len = s.length();
        int minLen = Integer.MAX_VALUE;
        int minLeft = -1, minRight = -1;
        while(r < len){
            if(ori.containsKey(s.charAt(r))){
                cnt.put(s.charAt(r), cnt.getOrDefault(s.charAt(r), 0) + 1);
            }
            r++;
            while(l<r && check()){
                if(r-l < minLen){
                    minLen = r-l;
                    minLeft = l;   
                    minRight = r;
                }
                if(ori.containsKey(s.charAt(l))){
                    cnt.put(s.charAt(l), cnt.getOrDefault(s.charAt(l), 0) - 1);
                }
                l++;
            }
        }
        if(minLeft != -1){
            return s.substring(minLeft, minRight);
        }
        return "";
    }

    private boolean check(){
        for(HashMap.Entry<Character,Integer> entry: ori.entrySet()){
            Character key = entry.getKey();
            Integer val = entry.getValue();
            if(cnt.getOrDefault(key, 0) < val){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

