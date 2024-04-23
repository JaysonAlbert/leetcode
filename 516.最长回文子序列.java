/*
 * @lc app=leetcode.cn id=516 lang=java
 *
 * [516] 最长回文子序列
 */

class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int i = n - 1; i >=0; i--){
            dp[i][i] = 1;
            char h = s.charAt(i);
            for(int j = i + 1; j < n; j ++){
                char t = s.charAt(j); 
                if(h == t){
                    dp[i][j] = dp[i+1][j-1] + 2;
                }else{
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }
        return dp[0][n-1];
    }
}
// @lc code=end

