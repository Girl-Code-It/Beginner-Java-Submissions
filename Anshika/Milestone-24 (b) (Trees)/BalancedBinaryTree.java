//https://leetcode.com/problems/balanced-binary-tree/submissions/

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
class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        
        if (root==null) {
            return true;
        }
        
        int left=height(root.left);
        int right=height(root.right);
        int bf=left-right;
        
        if (Math.abs(bf)>1) {
            return false;
        }
        
        if (isBalanced(root.left)==false) {
            return false;
        }
        
        if (isBalanced(root.right)==false) {
            return false;
        }
        
        return true;
    }
    
    static int height (TreeNode node) {
        
        if (node==null) {
            return 0;
        }
        
        int left=height(node.left);
        int right=height(node.right);
        
        return Math.max(left,right)+1;
    }
}