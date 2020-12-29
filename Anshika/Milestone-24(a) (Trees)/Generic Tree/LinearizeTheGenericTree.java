//https://www.pepcoding.com/resources/online-java-foundation/generic-tree/linearize-generic-tree-official/ojquestion#

import java.io.*;
import java.util.*;

public class LinearizeTheGenericTree {

    private static class Node {
        int data;
        ArrayList < Node > children = new ArrayList <Node > ();
    }

    public static Node linearize(Node node) {
        
        if (node.children.size()==0) {
            return node;
        }
        Node Tail=linearize (node.children.get(node.children.size()-1));
        
        while (node.children.size()!=1) {
            
            Node last=node.children.remove(node.children.size()-1);
            Node slast=node.children.get(node.children.size()-1);
            
            Node sTail=linearize(slast);
            sTail.children.add(last);
        }
        
        return Tail;

    }
}