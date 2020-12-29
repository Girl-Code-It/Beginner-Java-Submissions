//https://practice.geeksforgeeks.org/problems/count-non-leaf-nodes-in-tree/1#

class CountNonLeafNodeInBinaryTree
{

    class Node {
        int data;
        Node right;
        Node left;
    }

    int countNonLeafNodes(Node root)
    {
        if (root==null) {
            return 0;
        }
        if (root.left==null && root.right==null) {
            return 0;
        }

        int left=countNonLeafNodes (root.left);
        int right=countNonLeafNodes (root.right);

        return left+right+1;
    }
}