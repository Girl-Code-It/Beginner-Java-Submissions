//https://www.pepcoding.com/resources/online-java-foundation/generic-tree/max-generic-tree-official/ojquestion

import java.io.*;
import java.util.*;

public class MaximumInAGenericTree {

  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<Node>();
  }

  public static int max(Node node) {
    // write your code here
    
    int max=node.data;
    
    for (int i=0; i<node.children.size(); i++) {
        
        int store=max (node.children.get(i));
        max=Math.max(max,store);
    }
    return max;
  }
}