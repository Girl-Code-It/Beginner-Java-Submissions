//https://www.pepcoding.com/resources/online-java-foundation/binary-tree/transform-to-normal-from-left-cloned-tree-official/ojquestion#

import java.io.*;
import java.util.*;

public class TransformBackToNormalFromLeftClonedTree {

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

    public static Node transBackFromLeftClonedTree(Node node) {
        
        if (node==null) {
            return null;
        }
        
        if (node.left!=null && node.left.data==node.data) {
            node.left=node.left.left;
        }
        
        node.left=transBackFromLeftClonedTree (node.left);
        node.right=transBackFromLeftClonedTree (node.right);
        
        return node;
        
    }
}