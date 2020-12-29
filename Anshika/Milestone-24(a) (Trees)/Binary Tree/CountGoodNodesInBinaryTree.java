//https://leetcode.com/problems/count-good-nodes-in-binary-tree/submissions/

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
class CountGoodNodesInBinaryTree {

    public int goodNodes(TreeNode root) {
        
        return count(root,root.val);
    }
    
    static int count (TreeNode node, int data) {
        
        int cnt=0;
        if (node==null) {
            return 0;
        }
        if (data<=node.val) {
            cnt=1;
        }
        
        int left=count (node.left,Math.max(data,node.val));
        int right=count (node.right,Math.max(data,node.val));
        
        // System.out.println (left+" "+right+" "+node.val);
        return cnt+left+right;
        
        
    }
}