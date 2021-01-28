//https://leetcode.com/problems/subtree-of-another-tree/submissions/

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
class SubtreeOfAnotherTree {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        
        if (s==null && t==null) {
            return true;
        }
        if (s==null || t==null) {
            return false;
        }
        if (isSameTree(s,t)) {
            return true;
        }
        
        if (isSubtree(s.left,t)) {
            return true;
        }
        if (isSubtree(s.right,t)) {
            return true;
        }
        
        return false;
        
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if (p==null && q==null) {
            return true;
        }
        if (p==null || q==null) {
            return false;
        }
        
        if (p.val!=q.val) {
            return false;
        }
        if (isSameTree(p.left,q.left)==false) {
            return false;
        }
        if (isSameTree(p.right,q.right)==false) {
            return false;
        }
        
        return true;
    }
}