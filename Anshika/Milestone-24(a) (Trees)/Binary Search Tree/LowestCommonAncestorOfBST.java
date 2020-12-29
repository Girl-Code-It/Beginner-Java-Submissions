//https://www.pepcoding.com/resources/online-java-foundation/binary-search-tree/lca-bst-official/ojquestion#

import java.io.*;
import java.util.*;

public class LowestCommonAncestorOfBST {

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
    
    public static int lca(Node node, int d1, int d2) {
        if (d1<node.data && d2<node.data) {
            return lca (node.left,d1,d2);
        } else if (d1>node.data && d2>node.data) {
            return lca (node.right,d1,d2);
        } else {
            return node.data;
        }
    }
}