//https://www.pepcoding.com/resources/online-java-foundation/binary-tree/largest-bst-subtree-official/ojquestion#

import java.io.*;
import java.util.*;

public class LargestBSTSubtree {

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
    
    public static int size(Node node) {

        if (node == null) {
            return 0;
        }

        int left = size(node.left);
        int right = size(node.right);

        return left + right + 1;
    }

    public static boolean isBST (Node node, int min, int max) {
        
        if (node==null) {
            return true;
        }
        
        if (node.data>max || node.data<min) {
            return false;
        }
        
        if (isBST(node.left,min,node.data)==false) {
            return false;
        }
        if (isBST(node.right,node.data,max)==false) {
            return false;
        }
        
        return true;
    }

    public static class BSTPair {

        int size;
        Node node;

        BSTPair(Node node, int size) {
            this.node = node;
            this.size = size;
        }
    }

    public static BSTPair largestBST(Node node) {

        if (node == null) {
            return new BSTPair(null, 0);
        }

        BSTPair max = new BSTPair(null, 0);

        if (isBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE)) {

            int size = size(node);
            max.size = size;
            max.node = node;
        }

        BSTPair left = largestBST(node.left);
        BSTPair right = largestBST(node.right);

        if (left.size > max.size) {
            max.size = left.size;
            max.node = node.left;
        }
        if (right.size > max.size) {
            max.size = right.size;
            max.node = node.right;
        }

        return max;
    }
}