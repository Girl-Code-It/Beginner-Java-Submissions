//https://www.pepcoding.com/resources/online-java-foundation/generic-tree/ceil-and-floor-official/ojquestion#

import java.io.*;
import java.util.*;

public class CeilAndFloor {

    private static class Node {
        int data;
        ArrayList < Node > children = new ArrayList <Node > ();
    }
    
    static int ceil=Integer.MAX_VALUE;
    static int floor=Integer.MIN_VALUE;
    
    public static void ceilAndFloor(Node node, int data) {
        
        if (node.data>data) {
            ceil=Math.min(ceil,node.data);
        } else if (node.data<data) {
            floor=Math.max(floor,node.data);
        }
        
        for (int i=0; i<node.children.size(); i++) {
            ceilAndFloor (node.children.get(i),data);
        }
    }

}