//https://www.geeksforgeeks.org/count-full-nodes-binary-tree-iterative-recursive/

class CountFullNodesRecursivelyInBinaryTree
{

    class Node {
        int data;
        Node right;
        Node left;
    }

    int countFullNodes(Node root)
    {
        if (root==null) {
	        return 0;
	    }
	    
	    int count=0;
	    if (root.left!=null && root.right!=null) {
	        count++; 
	    }
	    
	    int left=countFullNodes (root.left);
	    int right=countFullNodes (root.right);
	    
	    return left+right+count;
    }
}