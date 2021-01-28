//https://www.pepcoding.com/resources/online-java-foundation/generic-tree/levelorder-linewise-generic-tree-official/ojquestion

import java.io.*;
import java.util.*;

public class LevelorderLinewise {

    private static class Node {
        int data;
        ArrayList < Node > children = new ArrayList <Node > ();
    }

    public static void levelOrderLinewise(Node node) {
        // write your code here

        LinkedList < Node > queue = new LinkedList < Node> ();
        queue.add(node);
        int cnt = 0, cntt = 1;

        while (queue.isEmpty() == false) {

            cnt = cntt;
            cntt=0;
            for (int i = 1; i <= cnt; i++) {

                Node temp = queue.remove();
                System.out.print(temp.data + " ");

                for (int j = 0; j < temp.children.size(); j++) {
                    queue.add(temp.children.get(j));
                }

                cntt = cntt+ temp.children.size();
            }

            System.out.println();
        }
    }
}