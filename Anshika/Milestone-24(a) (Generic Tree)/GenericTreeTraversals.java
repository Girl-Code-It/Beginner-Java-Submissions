//https://www.pepcoding.com/resources/online-java-foundation/generic-tree/generic-tree-traversal-official/ojquestion

import java.io.*;
import java.util.*;

public class GenericTreeTraversals {

    private static class Node {
        int data;
        ArrayList < Node > children = new ArrayList <Node > ();
    }

    public static void traversals(Node node) {
        // write your code here
        
        System.out.println ("Node Pre "+node.data);
        
        for (int i=0; i<node.children.size(); i++) {
            
            System.out.println ("Edge Pre "+node.data+"--"+node.children.get(i).data);
            traversals (node.children.get(i));
            System.out.println ("Edge Post "+node.data+"--"+node.children.get(i).data);            
        }
        
        System.out.println ("Node Post "+node.data);        
        
    }

}