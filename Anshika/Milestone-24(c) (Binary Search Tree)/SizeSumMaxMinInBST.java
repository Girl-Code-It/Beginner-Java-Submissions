//https://www.pepcoding.com/resources/online-java-foundation/binary-search-tree/size-sum-max-min-find-in-bst-official/ojquestion

import java.io.*;
import java.util.*;

public class SizeSumMaxMinInBST {
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

  public static int size(Node node) {
    // write your code here
    
    if (node==null) {
        return 0;
    }
    
    int left=size(node.left);
    int right=size(node.right);
    
    return left+right+1;
  }

  public static int sum(Node node) {
    // write your code here
    
    if (node==null) {
        return 0;
    }
    
    int left=sum(node.left);
    int right=sum(node.right);
    
    return left+right+node.data;
  }

  public static int max(Node node) {
    // write your code here
    
    if (node.right==null) {
        return node.data;
    }
    
    return max(node.right);
  }

  public static int min(Node node) {
    // write your code here
    if (node.left==null) {
        return node.data;
    }
    
    return min(node.left);
  }

  public static boolean find(Node node, int data){
    // write your code here
    
    if (node==null) {
        return false;
    } else if (node.data==data) {
        return true;
    } else if (node.data>data) {
        return find (node.left,data);
    } else {
        return find (node.right,data);
    }
  }  

}