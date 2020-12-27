//https://www.pepcoding.com/resources/online-java-foundation/binary-search-tree/tsp-bst-official/ojquestion#

import java.io.*;
import java.util.*;

public class TargetSumPairInBST {

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
    
    public static boolean find(Node node, int data){
    
    if (node==null) {
        return false;
    } else if (node.data==data) {
        return true;
    } else if (node.data>data) {
        return find (node.left,data);
    } else {
        return find (node.right,data);
    }
  }

    public static void targetSumPair(Node root, Node node, int sum) {

        if (node==null) {
            return;
        }
        
        targetSumPair (root,node.left,sum);
        
        int left=sum-node.data;
        if (left>node.data && find(root,left)) {
            System.out.println (node.data+" "+left);
        }
        
        targetSumPair (root,node.right,sum);
    }
}