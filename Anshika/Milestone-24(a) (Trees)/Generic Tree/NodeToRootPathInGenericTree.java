//https://www.pepcoding.com/resources/online-java-foundation/generic-tree/node-to-root-path-official/ojquestion#

import java.io.*;
import java.util.*;

public class NodeToRootPathInGenericTree {

    private static class Node {
        int data;
        ArrayList < Node > children = new ArrayList < Node> ();
    }

    public static ArrayList < Integer > nodeToRootPath(Node node, int data) {
        if (node.data==data) {
            ArrayList<Integer> list=new ArrayList<Integer>();
            list.add (data);
            return list;
        }
        
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        for (int i=0; i<node.children.size(); i++) {
            Node child=node.children.get(i);
            
            list=nodeToRootPath (child,data);
            if (list.size()!=0) {
                list.add (node.data);
                return list;
            }
        }

        return list;
    }


}