package graph;

/**
 * Created by kjangade on 8/7/2017.
 */

class Node {
    int data;
    Node left;
    Node right;
}

class BST {

    public static Node createNewNode(int k) {
        Node a = new Node();
        a.data = k;
        a.left = null;
        a.right = null;
        return a;
    }

    public static Node insertNode(Node node, int val) {

        if (node == null) {
            return createNewNode(val);
        }

        if (val < node.data) {
            node.left = insertNode(node.left, val);
        } else if (val > node.data) {
            node.right = insertNode(node.right, val);
        }

        return node;
    }
}

public class BSTApp {
    public static void main(String[] args) {
        BST a = new BST();
        Node root = null;

        root = a.insertNode(root, 8);
        root = a.insertNode(root, 3);
        root = a.insertNode(root, 6);
        root = a.insertNode(root, 10);
        root = a.insertNode(root, 4);
        root = a.insertNode(root, 7);
        root = a.insertNode(root, 1);
        root = a.insertNode(root, 14);
        root = a.insertNode(root, 13);

//        a.printTree(root);

    }


}
