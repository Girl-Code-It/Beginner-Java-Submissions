//https://www.pepcoding.com/resources/online-java-foundation/binary-tree/tilt-of-binary-tree/ojquestion#

import java.io.*;
import java.util.*;

public class TiltOfBinaryTree {
 
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
    
    public static int sum(Node node) {
        if (node==null) {
            return 0;
        }
        
        int left=sum(node.left);
        int right=sum(node.right);
        
        return left+right+node.data;
    }

    static int tilt = 0;
    public static void tilt(Node node) {
        
        if (node==null) {
            return;
        }
        
        int left=sum(node.left);
        int right=sum(node.right);
        
        tilt=tilt+Math.abs(left-right);
        
        tilt(node.left);
        tilt(node.right);
    }


}