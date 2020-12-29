//https://www.pepcoding.com/resources/online-java-foundation/generic-tree/level-order-generic-tree-official/ojquestion

import java.io.*;
import java.util.*;

public class LevelorderOfGenericTree {

    private static class Node {
        int data;
        ArrayList < Node > children = new ArrayList <Node > ();
    }

    public static void levelOrder(Node node) {
        // write your code here
        
        LinkedList<Node> queue=new LinkedList<Node>();
        queue.add(node);
        
        while (queue.isEmpty()==false) {
            Node temp=queue.remove();
            System.out.print (temp.data+" ");
            
            for (int i=0; i<temp.children.size(); i++) {
                queue.add(temp.children.get(i));
            }
        }
        
        System.out.println (".");
    }

}