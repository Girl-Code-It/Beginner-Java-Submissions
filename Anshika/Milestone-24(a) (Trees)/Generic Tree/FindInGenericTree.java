//https://www.pepcoding.com/resources/online-java-foundation/generic-tree/find-in-tree-official/ojquestion#

import java.io.*;
import java.util.*;

public class FindInGenericTree {
    private static class Node {
        int data;
        ArrayList < Node > children = new ArrayList <Node > ();
    }

    public static boolean find(Node node, int data) {
        
        if (node.data==data) {
            return true;
        }
        
        for (int i=0; i<node.children.size(); i++) {
            if (find(node.children.get(i),data)) {
                return true;
            }
        }
        
        return false;
    }

}