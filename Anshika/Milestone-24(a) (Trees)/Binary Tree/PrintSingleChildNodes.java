//https://www.pepcoding.com/resources/online-java-foundation/binary-tree/print-single-child-nodes-official/ojquestion#

import java.io.*;
import java.util.*;

public class PrintSingleChildNodes {

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

    public static void printSingleChildNodes(Node node, Node parent) {
        
        if (node==null) {
            return;
        }
        
        if (parent!=null) {
            if ((parent.left!=null && parent.right==null) || (parent.left==null && parent.right!=null)){
                System.out.println (node.data);
            }
        }
        
        printSingleChildNodes (node.left,node);
        printSingleChildNodes (node.right,node);
    }
}