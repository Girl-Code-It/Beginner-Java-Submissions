//https://leetcode.com/problems/diameter-of-binary-tree/submissions/

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
public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        
        if (root==null) {
            return 0;
        }
        
        int case1=height(root.left)+height(root.right);
        int case2=diameterOfBinaryTree (root.left);
        int case3=diameterOfBinaryTree (root.right);
        
        return Math.max(case1,Math.max(case2,case3));
    }
    
    static int height (TreeNode root) {
        if (root==null) {
            return 0;
        }
        
        int left=height (root.left);
        int right=height (root.right);
        
        return Math.max(left,right)+1;
    }
}