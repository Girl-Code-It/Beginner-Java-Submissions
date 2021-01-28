//https://www.pepcoding.com/resources/online-java-foundation/generic-tree/are-trees-mirror-in-shape-official/ojquestion#

import java.io.*;
import java.util.*;

public class AreTreesMirrorInShape {
    private static class Node {
        int data;
        ArrayList < Node > children = new ArrayList < Node> ();
    }

    public static boolean areMirror(Node n1, Node n2) {

        if (n1.children.size()!=n2.children.size()) {
            return false;
        } 
        for (int i=0; i<n1.children.size(); i++) {
            if (areMirror(n1.children.get(i),n2.children.get(n2.children.size()-1-i))==false) {
                return false;
            } 
        }
        
        return true;
    }

}