/*
 * @lc app=leetcode.cn id=112 lang=java
 * @lcpr version=30201
 *
 * [112] 路径总和
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    private boolean has = false;
    private int sum = 0;
    private int target;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        this.target = targetSum;
        if(root == null ){
            return false;
        }

        traverse(root);
        return has;
    }

    public void traverse(TreeNode root){
        if(has){
            return;
        }
        sum += root.val;
        if(root.left == null && root.right == null && target == sum){
            has = true;
            return;
        }
        if(root.left != null){
            traverse(root.left);
        }

        if(root.right != null){
            traverse(root.right);
        }
        sum -= root.val;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [5,4,8,11,null,13,4,7,2,null,null,null,1]\n22\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3]\n5\n
// @lcpr case=end

// @lcpr case=start
// []\n0\n
// @lcpr case=end

 */

