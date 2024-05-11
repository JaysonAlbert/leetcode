/*
 * @lc app=leetcode.cn id=101 lang=java
 * @lcpr version=30201
 *
 * [101] 对称二叉树
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
    public boolean isSymmetric(TreeNode root) {
        if(root == null || root.left == null && root.right == null){
            return true;
        }

        if(root.left == null || root.right == null){
            return false;
        }

        Queue<TreeNode> leftQueue = new LinkedList<TreeNode>();
        Queue<TreeNode> rightQueue = new LinkedList<TreeNode>();
        leftQueue.offer(root.left);
        rightQueue.offer(root.right);
        while(!leftQueue.isEmpty() && !rightQueue.isEmpty()){
            TreeNode left = leftQueue.poll();
            TreeNode right = rightQueue.poll();
            if(left.val != right.val){
                return false;
            }
            if(left.left == null ^ right.right == null){
                return false;
            }
            if(left.left != null){
                leftQueue.offer(left.left);
                rightQueue.offer(right.right);
            }

            if(left.right == null ^ right.left == null){
                return false;
            }

            if(left.right != null){
                leftQueue.offer(left.right);
                rightQueue.offer(right.left);
            }
            
        }

        return leftQueue.isEmpty() && rightQueue.isEmpty();


    }


}
// @lc code=end



/*
// @lcpr case=start
// [1,2,2,3,4,4,3]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,2,null,3,null,3]\n
// @lcpr case=end

 */

