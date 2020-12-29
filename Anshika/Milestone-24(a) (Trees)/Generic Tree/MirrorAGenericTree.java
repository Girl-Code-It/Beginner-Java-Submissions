//https://www.pepcoding.com/resources/online-java-foundation/generic-tree/mirror-generic-tree-official/ojquestion

import java.io.*;
import java.util.*;

public class MirrorAGenericTree {
    private static class Node {
        int data;
        ArrayList < Node > children = new ArrayList < Node> ();
    }

    public static void mirror(Node node) {
        // write your code here

        Collections.reverse(node.children);

        for (int i = 0; i < node.children.size(); i++) {
            mirror(node.children.get(i));
        }

    }
}