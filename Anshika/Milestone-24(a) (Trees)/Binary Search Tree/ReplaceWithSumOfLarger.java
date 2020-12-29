//https://www.pepcoding.com/resources/online-java-foundation/binary-search-tree/replace-with-sum-of-larger-official/ojquestion#

import java.io.*;
import java.util.*;

public class ReplaceWithSumOfLarger {

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

    static int sum = 0;

    public static void rwsol(Node node) {
        if (node == null) {
            return;
        }
        
        rwsol(node.right);
        
        sum=sum+node.data;
        node.data=sum-node.data;
        
        rwsol(node.left);
    }

}