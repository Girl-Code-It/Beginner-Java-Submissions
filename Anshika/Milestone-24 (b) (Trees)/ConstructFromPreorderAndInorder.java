//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/submissions/

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
public class ConstructFromPreorderAndInorder {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        TreeNode root=construct (preorder,0,preorder.length-1,inorder,0,inorder.length-1);
        return root;
    }
    
    static TreeNode construct (int[] pre, int pl, int ph, int[] in, int il, int ih) {
        
        if (pl>ph || il>ih) {
            return null;
        }
        
        TreeNode node=new TreeNode ();
        node.val=pre[pl];
        
        int ind=-1, cnt=0;
        for (int i=il; i<=ih; i++) {
            
            if (in[i]==node.val) {
                ind=i;
                break;
            }
            cnt++;
        }
        
        node.left= construct (pre,pl+1,pl+cnt,in,il,ind-1);
        node.right= construct (pre,pl+1+cnt,ph,in,ind+1,ih);
        
        return node;
    }
}