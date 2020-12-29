//https://www.pepcoding.com/resources/online-java-foundation/generic-tree/levelorder-linewise-zigzag-official/ojquestion#

import java.io.*;
import java.util.*;

public class LevelorderLinewiseZigZag {

    private static class Node {
        int data;
        ArrayList < Node > children = new ArrayList < Node> ();
    }

    public static void levelOrderLinewiseZZ(Node node) {
        
        Stack<Node> main=new Stack<Node>();
        Stack<Node> child=new Stack<Node>();
        main.push (node);
        
        int cnt=0, cntl=1, level=1;
        
        while (main.isEmpty()==false) {
            
            cnt=cntl;
            cntl=0;
            for (int i=1; i<=cnt; i++) {
                Node temp=main.pop();
                System.out.print (temp.data+" ");
                
                if (level%2==1) {
                    for (int j=0; j<temp.children.size(); j++) {
                        child.push (temp.children.get(j));
                    }
                } else {
                    for (int j=temp.children.size()-1; j>=0; j--) {
                        child.push(temp.children.get(j));
                    }
                }
                
                cntl=cntl+temp.children.size();
            }
            
            Stack<Node> store=child;
            child=main;
            main=store;
            
            level++;
            System.out.println ();
        }
    }
}