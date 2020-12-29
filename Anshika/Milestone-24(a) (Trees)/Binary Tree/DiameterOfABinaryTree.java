//https://www.pepcoding.com/resources/online-java-foundation/binary-tree/diameter-of-binary-tree-official/ojquestion#

import java.io.*;
import java.util.*;

public class DiameterOfABinaryTree {

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

    public static int height(Node node) {
        if (node == null) {
            return -1;
        }

        int lh = height(node.left);
        int rh = height(node.right);

        int th = Math.max(lh, rh) + 1;
        return th;
    }

    public static int diameter1(Node node) {
        
        if (node==null) {
            return 0;
        }
        
        int case1=height(node.left)+height(node.right)+2;
        int case2=diameter1(node.left);
        int case3=diameter1(node.right);
        
        return Math.max(case1, Math.max(case2,case3));
    }
}