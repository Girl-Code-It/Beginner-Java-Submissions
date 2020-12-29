//https://www.pepcoding.com/resources/online-java-foundation/generic-tree/node-with-maximum-subtree-sum-official/ojquestion#

import java.io.*;
import java.util.*;

public class NodeWithMaximumSubtreeSum {

    private static class Node {
        int data;
        ArrayList < Node > children = new ArrayList <Node > ();
    }

    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child: node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child: node.children) {
            display(child);
        }
    }

    public static Node construct(int[] arr) {
        Node root = null;

        Stack < Node > st = new Stack <Node > ();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }
        }

        return root;
    }
    
    static int sum (Node node) {
        
        int sum=0;
        for (int i=0; i<node.children.size(); i++) {
            sum=sum+sum(node.children.get(i));
        }
        
        return sum + node.data;
    }
    
    private static class Pair {
        int sum;
        Node n;
    }
    
    static Pair subtree (Node tree) {
        
        Pair stree=new Pair();
        stree.sum=sum(tree);
        stree.n=tree;
        
        Pair ch=new Pair();
        
        for (int i=0; i<tree.children.size(); i++) {
            ch=subtree(tree.children.get(i));
            if (ch.sum>stree.sum) {
                stree.sum=ch.sum;
                stree.n=ch.n;
            }
        }
        
        return stree;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        Node root = construct(arr);
        
        Pair ans=new Pair();
        ans=subtree(root);
        
        System.out.println (ans.n.data+"@"+ans.sum);
    }

}