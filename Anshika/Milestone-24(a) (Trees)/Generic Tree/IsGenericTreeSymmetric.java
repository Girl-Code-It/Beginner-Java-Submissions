//https://www.pepcoding.com/resources/online-java-foundation/generic-tree/is-generic-tree-symmetric-official/ojquestion#

import java.io.*;
import java.util.*;

public class IsGenericTreeSymmetric {

    private static class Node {
        int data;
        ArrayList < Node > children = new ArrayList < Node> ();
    }

    public static boolean IsSymmetric(Node node) {
        if (node==null) {
            return true;
        }
        
        for (int i=0; i<node.children.size()/2; i++) {
            Node n1=node.children.get(i);
            Node n2=node.children.get(node.children.size()-1-i);
            
            if (n1.children.size()!=n2.children.size()) {
                return false;
            }
            
            if (IsSymmetric(n2)==false || IsSymmetric(n2)==false) {
                return false;
            }
        }
        
        return true;
    }

}