//https://www.pepcoding.com/resources/online-java-foundation/binary-tree/remove-leaves-binary-tree-official/ojquestion

import java.io.*;
import java.util.*;

public class RemoveLeavesInABinaryTree {

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

    public static Node removeLeaves(Node node) {
        if (node==null) {
            return null;
        }
        if (node.left==null && node.right==null) {
            return null;
        }
        node.left=removeLeaves(node.left);
        node.right=removeLeaves(node.right);
        
        return node;
    }
}