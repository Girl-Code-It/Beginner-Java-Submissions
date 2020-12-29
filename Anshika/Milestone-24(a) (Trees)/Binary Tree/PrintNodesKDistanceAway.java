//https://www.pepcoding.com/resources/online-java-foundation/binary-tree/print-nodes-k-away-binary-tree-official/ojquestion#

import java.io.*;
import java.util.*;

public class PrintNodesKDistanceAway {

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
    
    public static ArrayList < Node > nodeToRootPath(Node node, int data) {
        if (node==null) {
            return new ArrayList<Node>();
        }
        if (node.data==data) {
            ArrayList<Node> list=new ArrayList<Node>();
            list.add(node);
            return list;
        } else {
            
            ArrayList<Node> ll=nodeToRootPath(node.left,data);
            ArrayList<Node> lr=nodeToRootPath(node.right,data);
            
            if (ll.size()!=0) {
                ll.add(node);
                return ll;
            } else if (lr.size()!=0) {
                lr.add(node);
                return lr;
            }
            
            return new ArrayList<Node>();
        }
    }
    
    public static void printKLevelsDown(Node node, int k, Node block) {
        
        if (node==null || k<0 || node==block) {
            return;
        } 
        if (k==0) {
            System.out.println (node.data);
        } else {
            printKLevelsDown (node.left,k-1,block);
            printKLevelsDown (node.right,k-1,block);
        }
        
        
    }

    public static void printKNodesFar(Node node, int data, int k) {
        
        ArrayList<Node> path=nodeToRootPath (node,data);
        Node blocker=null;
        
        for (int i=0; i<path.size(); i++) {
            printKLevelsDown (path.get(i),k-i,blocker);
            blocker=path.get(i);
        }
    }
}