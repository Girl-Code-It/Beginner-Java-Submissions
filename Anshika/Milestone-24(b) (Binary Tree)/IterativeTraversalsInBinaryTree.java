//https://www.pepcoding.com/resources/online-java-foundation/binary-tree/iterative-pre-post-in-binary-tree-official/ojquestion#

import java.io.*;
import java.util.*;

public class IterativeTraversalsInBinaryTree {

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

    public static void iterativePrePostInTraversal(Node node) {
        
        preorder(node);
        System.out.println ();
        inorder(node);
        System.out.println ();
        postorder(node);
        
    }
    
    public static void preorder (Node node) {
        
        Stack<Node> pre=new Stack<Node>();
        Node temp=node;
        
        while (true) {
            if (temp!=null) {
                System.out.print (temp.data+" ");
                pre.push(temp.right);
                temp=temp.left;
            } else {
                if (pre.isEmpty()) {
                    break;
                }
                temp=pre.pop();
            }
        }
    }
    
    public static void inorder (Node node) {
        
        Stack<Node> in=new Stack<Node>();
        Node temp=node;
        
        while (true) {
            if (temp!=null) {
                in.push(temp);
                temp=temp.left;
            } else {
                if (in.isEmpty()) {
                    break;
                }
                temp=in.pop();
                System.out.print (temp.data+" ");
                temp=temp.right;
            }
        }
    }
    
    public static void postorder (Node node) {
        
        Stack<Node> post=new Stack<Node>();
        Node temp=node;
        
        while (true) {
            
            if (temp!=null) {
                post.push(temp);
                post.push(temp);
                temp=temp.left;
            } else {
                
                if (post.isEmpty()) {
                    break;
                }
                
                temp=post.pop();
                if (post.isEmpty()==false && post.peek()==temp) {
                    temp=temp.right;
                } else {
                    System.out.print (temp.data+" ");
                    temp=null;
                }
            }
        }
    }

}