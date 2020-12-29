//https://www.pepcoding.com/resources/online-java-foundation/generic-tree/iterative-preorder-postorder-generic-tree-official/ojquestion#

import java.io.*;
import java.util.*;

public class IterativePreorderAndPostorder {

    private static class Node {
        int data;
        ArrayList < Node > children = new ArrayList <Node > ();
    }
    
    static class Pair { 
        public Node node; 
        public int state; 
        
        public Pair(Node node, int state) 
        { 
            this.node = node; 
            this.state=state; 
        } 
    }

    public static void iterativePreandPostOrder(Node node) {
        
        ArrayList<Integer> preorder=new ArrayList<Integer>();
        ArrayList<Integer> postorder=new ArrayList<Integer>();
        
        Stack<Pair> st=new Stack<Pair>();
        st.push(new Pair(node,-1));
        
        while (st.isEmpty()==false) {
            
            Pair top=st.peek();
            
            if (top.state==-1) {
                preorder.add(top.node.data);
                top.state++;
            } else if (top.state==top.node.children.size()) {
                postorder.add(top.node.data);
                st.pop();
            } else {
                st.push(new Pair(top.node.children.get(top.state),-1));
                top.state++;
            }
        }
        
        printOrder (preorder);
        printOrder (postorder);
    }
    
    public static void printOrder (ArrayList<Integer> list) {
        
        for (int i=0; i<list.size(); i++) {
            System.out.print (list.get(i)+" ");
        }
        
        System.out.println ();
    }
}