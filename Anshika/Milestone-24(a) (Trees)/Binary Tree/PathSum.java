//https://leetcode.com/explore/learn/card/data-structure-tree/17/solve-problems-recursively/537/

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
class PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        
        if (root==null) {
            return false;
        }
        
        if (root.left==null && root.right==null) {
            if (sum==root.val) {
                return true;
            }
        }
        
        if (hasPathSum(root.left,sum-root.val)) {
            return true;
        }
        if (hasPathSum(root.right,sum-root.val)) {
            return true;
        }
        
        return false;
        
    }
}