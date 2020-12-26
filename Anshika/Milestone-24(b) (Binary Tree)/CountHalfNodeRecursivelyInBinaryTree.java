//https://www.geeksforgeeks.org/count-half-nodes-in-a-binary-tree-iterative-and-recursive/

class CountHalfNodeRecursivelyInBinaryTree
{

    class Node {
        int data;
        Node right;
        Node left;
    }

	int countHalfNodes(Node root)
	{
	    if (root==null) {
	        return 0;
	    }
	    
	    int count=0;
	    if ((root.left!=null && root.right==null) || (root.left==null && root.right!=null)) {
	        count++; 
	    }
	    
	    int left=countHalfNodes (root.left);
	    int right=countHalfNodes (root.right);
	    
	    return left+right+count;
	}
}