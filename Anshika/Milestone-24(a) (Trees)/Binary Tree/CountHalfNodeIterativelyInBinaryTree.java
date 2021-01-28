//https://www.geeksforgeeks.org/count-half-nodes-in-a-binary-tree-iterative-and-recursive/

import java.util.*;

class CountHalfNodeIterativelyInBinaryTree
{

    class Node {
        int data;
        Node right;
        Node left;
    }

    int countHalfNodes(Node root)
	{
	    LinkedList<Node> que=new LinkedList<Node>();
	    que.add(root);
	    int cnt=0;
	    
	    while (que.isEmpty()==false) {
	        
	        Node temp=que.remove();
	        if (temp.left!=null) {
	            que.add(temp.left);
	        }
	        if (temp.right!=null) {
	            que.add(temp.right);
	        }
	        
	        if ((temp.left==null && temp.right!=null) || (temp.left!=null && temp.right==null)){
	            cnt++;
	        }
	    }
	    
	    return cnt;
	}
}