//https://www.pepcoding.com/resources/online-java-foundation/binary-tree/levelorder-binarytree-official/ojquestion

import java.io.*;
import java.util.*;

public class LevelorderTraversalOfBinaryTree {

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
    
    public static void levelOrder(Node node) {
        LinkedList<Node> que=new LinkedList<Node>();
        que.add(node);
        int cnt1=1,cnt;
        
        while (que.isEmpty()==false) {
            cnt=cnt1;
            cnt1=0;
            for (int i=1; i<=cnt; i++) {
                Node temp=que.remove();
                System.out.print  (temp.data+" ");
            
            if (temp.left!=null) {
                cnt1++;
                que.add(temp.left);
            }
            
            if (temp.right!=null) {
                cnt1++;
                que.add(temp.right);
            }
            }
            System.out.println ();
        }
    }

}