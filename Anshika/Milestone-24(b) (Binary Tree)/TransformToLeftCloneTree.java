//https://www.pepcoding.com/resources/online-java-foundation/binary-tree/transform-to-left-cloned-tree-official/ojquestion#

import java.io.*;
import java.util.*;

public class TransformToLeftCloneTree {

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

    public static Node createLeftCloneTree(Node node) {
        if (node==null) {
            return null;
        }
        
        Node temp=new Node(node.data,null,null);
        temp.left=node.left;
        node.left=temp;
        
        temp.left=createLeftCloneTree(temp.left);
        node.right=createLeftCloneTree(node.right);
        
        return node;
    }

}