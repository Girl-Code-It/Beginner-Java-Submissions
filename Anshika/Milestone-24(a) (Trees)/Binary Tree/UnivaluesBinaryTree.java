//https://leetcode.com/problems/univalued-binary-tree/

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
class UnivaluesBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        
        return isUnivalTree(root,root.val);
    }
    
    private boolean isUnivalTree (TreeNode node, int val) {
        
        if (node==null) {
            return true;
        }
        if (node.val!=val) {
            return false;
        }
        if (isUnivalTree(node.left,val)==false) {
            return false;
        }
        if (isUnivalTree(node.right,val)==false) {
            return false;
        }
        
        return true;
    }
}