//https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/submissions/

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
class ConstructFromPostorderAndInorder {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
     
        TreeNode root=construct (postorder,0,postorder.length-1,inorder,0,inorder.length-1);
        return root;
    }
    
    static TreeNode construct (int[] post, int pl, int ph, int[] in, int il, int ih) {
        
        if (pl>ph || il>ih) {
            return null;
        }
        
        TreeNode node=new TreeNode ();
        node.val=post[ph];
        
        int ind=-1, cnt=0;
        for (int i=il; i<=ih; i++) {
            
            if (in[i]==node.val) {
                ind=i;
                break;
            }
            cnt++;
        }
        
        node.left= construct (post,pl,pl+cnt-1,in,il,ind-1);
        node.right= construct (post,pl+cnt,ph-1,in,ind+1,ih);
        
        return node;
    }
}