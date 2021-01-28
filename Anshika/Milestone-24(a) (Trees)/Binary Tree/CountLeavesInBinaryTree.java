//https://practice.geeksforgeeks.org/problems/count-leaves-in-binary-tree/1

class CountLeavesInBinaryTree
{

    class Node {
        int data;
        Node left;
        Node right;
    }

    int countLeaves(Node node) 
    {
        if (node==null) {
            return 0;
        }
        if (node.left==null && node.right==null) {
            return 1;
        } 

        int left=countLeaves(node.left);
        int right=countLeaves(node.right);

        return left+right;
    }
}