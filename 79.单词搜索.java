/*
 * @lc app=leetcode.cn id=79 lang=java
 *
 * [79] 单词搜索
 */

// @lc code=start
class Solution {

    int boardW, boardH;

    public boolean exist(char[][] board, String word) {
        boardW = board[0].length;
        boardH = board.length;
        boolean[][] used = new boolean[board.length][board[0].length];
        char[] w = word.toCharArray();
        
        for(int i=0; i< boardH; i++){
            for(int j=0;j< boardW; j++){
                if(isMatch(board, used, w, 0, i, j)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isMatch(char[][] board, boolean[][] used, char[] w,int i, int x, int y){
        if(!isNextChar(board, used, w, i, x, y)){
            return false;
        }
        used[x][y] = true;
        if(i == w.length){
            return true;
        }

        boolean match = false;
        match |= isMatch(board, used, w, i + 1, x+1, y);
        match |= isMatch(board, used, w, i+1, x-1, y);
        match |= isMatch(board, used, w, i+1, x, y+1);
        match |= isMatch(board, used, w, i+1, x, y-1);
        used[x][y] = false;
        return match;
    }

    public boolean isNextChar(char[][] board, boolean[][] used,char[]w, int i, int x, int y){
        return axisValid(x, y) && board[x][y] == w[i] && !used[x][y];
    }

    public boolean axisValid(int x, int y){
        return x >=0 && y >=0 && x < boardH && y < boardW;
    }
}
// @lc code=end

