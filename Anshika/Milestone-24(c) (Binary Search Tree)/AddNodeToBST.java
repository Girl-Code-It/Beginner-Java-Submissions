//https://www.pepcoding.com/resources/online-java-foundation/binary-search-tree/add-node-to-bst-official/ojquestion#

import java.io.*;
import java.util.*;

public class AddNodeToBST {

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

    public static Node add(Node node, int data) {
        
        if (node==null) {
            Node temp=new Node(data,null,null);
            return temp;
        }
        if (data<node.data) {
            node.left=add(node.left,data);
        } else if (data>node.data) {
            node.right=add(node.right,data);
        }
        
        return node;
    }
}