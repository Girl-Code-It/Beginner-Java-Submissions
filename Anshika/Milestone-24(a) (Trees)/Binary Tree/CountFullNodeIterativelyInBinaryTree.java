//https://www.geeksforgeeks.org/count-full-nodes-binary-tree-iterative-recursive/

import java.util.*;

class CountFullNodeIterativelyInBinaryTree
{

    class Node {
        int data;
        Node right;
        Node left;
    }

    int countFullNodes(Node root)
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
	        
	        if (temp.left!=null && temp.right!=null) {
	            cnt++;
	        }
	    }
	    
	    return cnt;
	}
}