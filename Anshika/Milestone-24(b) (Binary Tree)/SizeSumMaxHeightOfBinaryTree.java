//https://www.pepcoding.com/resources/online-java-foundation/binary-tree/size-sum-max-height-binarytree-official/ojquestion

import java.io.*;
import java.util.*;

public class SizeSumMaxHeightOfBinaryTree {
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
        // write your code here
        if (node==null) {
            return 0;
        }
        
        int left=size(node.left);
        int right=size(node.right);
        
        return left+right+1;
    }

    public static int sum(Node node) {
        if (node==null) {
            return 0;
        }
        
        int left=sum(node.left);
        int right=sum(node.right);
        
        return left+right+node.data;
    }

    public static int max(Node node) {
        if (node==null) {
            return 0;
        }
        
        int max=node.data;
        int left=max(node.left);
        int right=max(node.right);
        
        return Math.max(left,Math.max(right,max));
    }

    public static int height(Node node) {
        if (node==null) {
            return -1;
        }
        
        int left=height(node.left);
        int right=height(node.right);
        
        return Math.max(left,right)+1;
    }

}