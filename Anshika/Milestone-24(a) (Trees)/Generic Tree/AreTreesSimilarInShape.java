//https://www.pepcoding.com/resources/online-java-foundation/generic-tree/are-generic-trees-similar-official/ojquestion#

import java.io.*;
import java.util.*;

public class AreTreesSimilarInShape {
    private static class Node {
        int data;
        ArrayList < Node > children = new ArrayList <Node > ();
    }

    public static boolean areSimilar(Node n1, Node n2) {
        // write your code here
        if (n1.children.size()!=n2.children.size()) {
            return false;
        }
        
        for (int i=0; i<n1.children.size(); i++) {
            Node ch1=n1.children.get(i);
            Node ch2=n2.children.get(i);
            
            if (areSimilar(ch1,ch2)==false) {
                return false;
            }
        }
        
        return true;
    }
}