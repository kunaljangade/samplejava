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

    private static Node createNewNode(int k) {
        Node a = new Node();
        a.data = k;
        a.left = null;
        a.right = null;
        return a;
    }

    private static int leftCount = 0;
    private static int rightCount = 0;

    public static int countLeftNodes(Node node) {
        if (node == null)
            return 0;

        if (node.left != null) {
            leftCount += node.left.data;
            countLeftNodes(node.left);
        }
        if (node.right != null) {
            countLeftNodes(node.right);
        }
        return leftCount;
    }

    public static int countRightNodes(Node node) {
        if (node == null)
            return 0;

        if (node.left != null) {
            countRightNodes(node.left);
        }
        if (node.right != null) {
            rightCount += node.right.data;
            countRightNodes(node.right);
        }
        return rightCount;
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

        //int sum = a.countLeftNodes(root);
        //System.out.println("Sum of Left Children: " + sum);

        System.out.println("Left Count: " + a.countLeftNodes(root));
        System.out.println("Right Count: " + a.countRightNodes(root));
    }


}
