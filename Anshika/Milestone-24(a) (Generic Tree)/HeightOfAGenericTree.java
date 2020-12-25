//https://www.pepcoding.com/resources/online-java-foundation/generic-tree/height-of-generic-tree-official/ojquestion

import java.io.*;
import java.util.*;

public class HeightOfAGenericTree {

  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<Node>();
  }

  public static int height(Node node) {
    // write your code here
    
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

}