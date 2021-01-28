//https://www.pepcoding.com/resources/online-java-foundation/binary-tree/find-nodetorootpath-binary-tree-official/ojquestion

import java.io.*;
import java.util.*;

public class FindAndNodeToRootPath {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean find(Node node, int data) {
        // write your code here
        
        if (node==null) {
            return false;
        }
        
        if (node.data==data) {
            return true;
        }
        
        if (find(node.left,data)) {
            return true;
        }
        if (find(node.right,data)) {
            return true;
        }
        
        return false;
    }

    public static ArrayList < Integer > nodeToRootPath(Node node, int data) {
        if (node==null) {
            return new ArrayList<Integer>();
        }
        if (node.data==data) {
            ArrayList<Integer> list=new ArrayList<Integer>();
            list.add(data);
            return list;
        } else {
            
            ArrayList<Integer> ll=nodeToRootPath(node.left,data);
            ArrayList<Integer> lr=nodeToRootPath(node.right,data);
            
            if (ll.size()!=0) {
                ll.add(node.data);
                return ll;
            } else if (lr.size()!=0) {
                lr.add(node.data);
                return lr;
            }
            
            return new ArrayList<Integer>();
        }
    }

}