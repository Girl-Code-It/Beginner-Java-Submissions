//https://www.pepcoding.com/resources/online-java-foundation/generic-tree/remove-leaves-generic-tree-official/ojquestion

import java.io.*;
import java.util.*;

public class RemoveLeavesInGenericTree {

    private static class Node {
        int data;
        ArrayList < Node > children = new ArrayList <Node > ();
    }

    public static void removeLeaves(Node node) {
        // write your code here
        
        for (int i=node.children.size()-1; i>=0; i--) {
            Node child=node.children.get(i);
            
            if (child.children.size()==0) {
                node.children.remove(i);
            }
        }
        
        for (int i=0; i<node.children.size(); i++) {
            removeLeaves (node.children.get(i));
        }
    }

}