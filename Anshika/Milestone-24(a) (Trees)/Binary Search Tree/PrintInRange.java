//https://www.pepcoding.com/resources/online-java-foundation/binary-search-tree/pir-bst-official/ojquestion#

import java.io.*;
import java.util.*;

public class PrintInRange {

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
    
    public static void pir (Node node, int d1, int d2) {
        if (node==null) {
            return;
        }
        
        pir (node.left,d1,d2);
        if (node.data>=d1 && node.data<=d2) {
            System.out.println (node.data);
        }
        pir (node.right,d1,d2);
    }

}