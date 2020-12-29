//https://www.pepcoding.com/resources/online-java-foundation/generic-tree/pred-succ-generic-tree-official/ojquestion#

import java.io.*;
import java.util.*;

public class PredecessorAndSuccessor {

    private static class Node {
        int data;
        ArrayList < Node > children = new ArrayList <Node > ();
    }

    static Node predecessor;
    static Node successor;
    static int state=0;
    
    public static void predecessorAndSuccessor(Node node, int data) {
        
        if (state==0) {
            if (node.data==data) {
                state=1;
            } else {
                predecessor=node;
            }
        } else if (state==1) {
            successor=node;
            state=2;
        }
        
        for (int i=0; i<node.children.size(); i++) {
            predecessorAndSuccessor (node.children.get(i),data);
        }
        
    }
}