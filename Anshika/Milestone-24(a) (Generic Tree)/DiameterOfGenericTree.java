//https://www.pepcoding.com/resources/online-java-foundation/generic-tree/diameter-of-generic-tree-official/ojquestion#

import java.io.*;
import java.util.*;

public class DiameterOfGenericTree {

    private static class Node {
        int data;
        ArrayList < Node > children = new ArrayList <Node > ();
    }
    
    public static int height(Node node) {
    
    if (node.children.size()==0) {
        return 0;
    }
    
    int cnt=0, max=0;
    for (int i=0; i<node.children.size(); i++) {
        cnt=1+height (node.children.get(i));
        max=Math.max(max,cnt);
    }
    
    return max;
  }
    
    public static int diameter (Node node) {
        
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        for (int i=0; i<node.children.size(); i++) {
            list.add(height(node.children.get(i)));
        }
        
        Collections.sort(list);
        int max1=0, max2=0;
        
        if (list.size()>2) {
            max1=list.get(list.size()-1);
            max2=list.get(list.size()-2);
        }
        
        int dia=max1+max2+2;
        
        for (int i=0; i<node.children.size(); i++) {
            dia=Math.max(dia,diameter(node.children.get(i)));
        }
        
        return dia;
    }
}