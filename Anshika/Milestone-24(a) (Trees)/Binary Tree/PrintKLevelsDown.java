//https://www.pepcoding.com/resources/online-java-foundation/binary-tree/print-k-levels-down-official/ojquestion

import java.io.*;
import java.util.*;

public class PrintKLevelsDown {

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

    public static void printKLevelsDown(Node node, int k) {
        // write your code here
        
        if (node==null) {
            return;
        } 
        if (k==0) {
            System.out.println (node.data);
        } else {
            printKLevelsDown (node.left,k-1);
            printKLevelsDown (node.right,k-1);
        }
        
        
    }

}