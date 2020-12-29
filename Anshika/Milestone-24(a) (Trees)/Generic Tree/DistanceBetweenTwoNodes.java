//https://www.pepcoding.com/resources/online-java-foundation/generic-tree/distance-between-nodes-official/ojquestion#

import java.io.*;
import java.util.*;

public class DistanceBetweenTwoNodes {

    private static class Node {
        int data;
        ArrayList < Node > children = new ArrayList <Node > ();
    }
    
    public static ArrayList < Integer > nodeToRootPath(Node node, int data) {
        if (node.data == data) {
            ArrayList < Integer > path = new ArrayList <Integer > ();
            path.add(node.data);
            return path;
        }

        for (Node child: node.children) {
            ArrayList < Integer > ptc = nodeToRootPath(child, data);
            if (ptc.size() > 0) {
                ptc.add(node.data);
                return ptc;
            }
        }

        return new ArrayList <Integer > ();
    }

    public static int distanceBetweenNodes(Node node, int d1, int d2) {
        
        ArrayList<Integer> list1=nodeToRootPath (node,d1);
        ArrayList<Integer> list2=nodeToRootPath (node,d2);
        
        int i=list1.size()-1;
        int j=list2.size()-1;
        
        while (i>=0 && j>=0 && list1.get(i)==list2.get(j)) {
            i--;
            j--;
        }
        
        int dis=(i+1)+(j+1);
        
        return dis;
    }
}