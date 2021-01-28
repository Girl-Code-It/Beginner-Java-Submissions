//https://www.pepcoding.com/resources/online-java-foundation/generic-tree/kth-largest-element-generic-tree-official/ojquestion#

import java.io.*;
import java.util.*;

public class KthLargestElement {

    private static class Node {
        int data;
        ArrayList < Node > children = new ArrayList <Node > ();
    }

    static int floor;
    public static void ceilAndFloor(Node node, int data) {
        if (node.data < data) {
            if (node.data > floor) {
                floor = node.data;
            }
        }

        for (Node child: node.children) {
            ceilAndFloor(child, data);
        }
    }

    public static int kthLargest(Node node, int k) {
        
        floor=Integer.MIN_VALUE;
        int factor=Integer.MAX_VALUE;
        
        for (int i=1; i<=k; i++) {
            ceilAndFloor (node,factor);
            factor=floor;
            floor=Integer.MIN_VALUE;
        }
        
        return factor;
    }
}