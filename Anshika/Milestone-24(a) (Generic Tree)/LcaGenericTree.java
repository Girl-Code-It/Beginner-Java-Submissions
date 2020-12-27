//https://www.pepcoding.com/resources/online-java-foundation/generic-tree/lca-generic-tree-official/ojquestion#

import java.io.*;
import java.util.*;

public class LcaGenericTree {

    private static class Node {
        int data;
        ArrayList < Node > children = new ArrayList <Node > ();
    }
    
    public static boolean find(Node node, int data) {

        if (node.data == data) {
            return true;
        }

        for (int i = 0; i < node.children.size(); i++) {
            if (find(node.children.get(i), data)) {
                return true;
            }
        }

        return false;
    }

    public static int lca(Node node, int d1, int d2) {
        
        int store=node.data;
        
        for (int i=0; i<node.children.size(); i++) {
            
            Node child=node.children.get(i);
            boolean b1=find(child,d1);
            boolean b2=find(child,d2);
        
            if (b1 && b2) {
                store=lca(child,d1,d2);
            } else if ((b1 && !b2) || (!b1 && b2)) {
                return node.data;
            }
        }
        
        return store;
    }
}