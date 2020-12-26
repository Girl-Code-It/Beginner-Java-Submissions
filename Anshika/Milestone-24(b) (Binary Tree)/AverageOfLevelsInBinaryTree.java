//https://leetcode.com/problems/average-of-levels-in-binary-tree/


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

import java.util.*;

class AverageOfLevelsInBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> list=new ArrayList<Double>();
        LinkedList<TreeNode> que=new LinkedList<TreeNode>();
        
        que.add(root);
        long cnt=0, lcnt=1, sum=0;
        
        while (que.isEmpty()==false) {
            
            sum=0;
            cnt=lcnt;
            lcnt=0;
            
            for (int i=1; i<=cnt; i++) {
                TreeNode temp=que.remove();
                sum=sum+temp.val;
                
                if (temp.left!=null) {
                    que.add(temp.left);
                    lcnt++;
                }
                
                if (temp.right!=null) {
                    que.add(temp.right);
                    lcnt++;
                } 
            }
            
            
                double avg=sum/(double)cnt;
                list.add(avg);
            
            
        }
        
        return list;
    }
}