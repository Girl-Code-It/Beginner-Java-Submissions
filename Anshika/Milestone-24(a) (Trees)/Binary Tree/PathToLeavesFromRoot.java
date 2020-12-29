//https://www.pepcoding.com/resources/online-java-foundation/binary-tree/binary-tree-path-to-leaves-from-root-official/ojquestion#

import java.io.*;
import java.util.*;

public class PathToLeavesFromRoot {

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

    public static void pathToLeafFromRoot(Node node, String path, int sum, int lo, int hi) {
        
        if (node==null) {
            return;
        }
        
        if (sum+node.data>=lo && sum+node.data<=hi && node.left==null && node.right==null) {
            System.out.println (path+node.data);
            return;
        }
        
        pathToLeafFromRoot (node.left,path+node.data+" ",sum+node.data,lo,hi);
        pathToLeafFromRoot (node.right,path+node.data+" ",sum+node.data,lo,hi);
    }

}