//https://www.pepcoding.com/resources/online-java-foundation/binary-search-tree/remove-node-in-bst-official/ojquestion#

import java.io.*;
import java.util.*;

public class RemoveNodeFromBST {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }


    public static Node remove(Node node, int data) {
        
        if (data<node.data) {
            node.left=remove(node.left,data);
        } else if (data>node.data) {
            node.right=remove(node.right,data);
        } else {
            
            if (node.left==null && node.right==null) {
                return null;
            } else if (node.left==null && node.right!=null) {
                return node .right;
            } else if (node.left!=null && node.right==null) {
                return node.left;
            } else {
                int max=max(node.left);
                node.data=max;
                node.left=remove(node.left,max);
                return node;
            }
        }
        
        return node;
    }
    
    static int max (Node node) {
        if (node.right==null) {
            return node.data;
        }
        return max(node.right);
    }

}