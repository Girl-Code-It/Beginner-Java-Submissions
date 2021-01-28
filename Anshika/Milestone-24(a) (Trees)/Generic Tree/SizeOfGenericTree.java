//https://www.pepcoding.com/resources/online-java-foundation/generic-tree/size-generic-tree-official/ojquestion

import java.io.*;
import java.util.*;

public class SizeOfGenericTree {

  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<Node>();
  }
  
  public static int size(Node node){
    // write your code here
    
    int cnt=1;
    
    for (int i=0; i<node.children.size(); i++) {
        cnt=cnt+size (node.children.get(i));
    }
    
    return cnt;
  }
}